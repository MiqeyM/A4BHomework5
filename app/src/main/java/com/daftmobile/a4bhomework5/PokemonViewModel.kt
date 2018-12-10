package com.daftmobile.a4bhomework5

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by Konrad Kowalewski.
 */
class PokemonViewModel: ViewModel() {

    private  val pokemonDataSource: PokemonDataSource = PokemonFetcher()

    private val pokemonLiveData = SingleLiveEvent<PokemonItem>()
    private val errorLiveData = SingleLiveEvent<String>()

    fun newPokemon(): LiveData<PokemonItem> = pokemonLiveData
    fun error(): LiveData<String> = errorLiveData

    fun showPokemonInfo(index: String) {

        val requestedId = index.toIntOrNull() ?: 0
        //Wrong input ID
        if (requestedId <= 0)
            return

        else {
            pokemonDataSource.fetch(
                    {pokemonLiveData.value = it},
                    {errorLiveData.value = it},
                    requestedId)
        }

    }
}
