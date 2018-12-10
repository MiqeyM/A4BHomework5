package com.daftmobile.a4bhomework5

import android.os.Parcelable
import android.support.annotation.ColorInt
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonItem (
        val number: String,
        val name: String,
        @ColorInt val color: Int
) : Parcelable
