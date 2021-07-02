package com.rogerio.app08

import android.graphics.drawable.Drawable

data class Pets(
    var foto: Drawable?=null,
    var nome: String,
    var idade: Idade,
    var raca: Raca
)