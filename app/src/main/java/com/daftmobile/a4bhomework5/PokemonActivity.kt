package com.daftmobile.a4bhomework5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pokemon.*

class PokemonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        val displayedPokemon = intent.getParcelableExtra<PokemonItem>("PokemonObject")
        nameView.text = displayedPokemon.name
        colorView.setBackgroundColor(displayedPokemon.color)
        numberView.text = displayedPokemon.number

    }
}
