package com.daftmobile.a4bhomework5

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    //  /api/pokemon/:number/peek
    @GET("/api/pokemon/{number}/peek")
    fun getPokemon(@Path("number")pokemonId : Int) : Call<PokemonItem>
}