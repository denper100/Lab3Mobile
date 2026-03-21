package com.example.lab3mobile

import java.io.Serializable

data class Tip(
    val day: Int,
    val title: String,
    val fullDescription: String,  // Полное описание
    val imageResId: Int
) : Serializable