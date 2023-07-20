package com.cheesecake.donutz.presentation.screens.home

import com.cheesecake.donutz.model.Donuts

data class HomeUIState (
    val donuts: List<Donuts> = emptyList()
)