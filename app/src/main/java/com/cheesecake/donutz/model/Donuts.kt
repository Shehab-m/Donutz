package com.cheesecake.donutz.model

data class Donuts(
    val imageId: Int,
    val name: String,
    val details: String,
    val oldPrice: Int,
    val price: Int,
    val isFavourite: Boolean
)