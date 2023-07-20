package com.cheesecake.donutz.presentation.screens.donutDetails.viewModel

data class DonutDetailsUIState(
    val imageId: Int = 0,
    val name: String = "",
    val details: String = "",
    val price: Int = 16,
    val quantity: Int = 1,
    val isFavourite: Boolean = false
)