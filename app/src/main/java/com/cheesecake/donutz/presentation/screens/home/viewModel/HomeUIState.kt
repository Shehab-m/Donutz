package com.cheesecake.donutz.presentation.screens.home.viewModel

import com.cheesecake.donutz.model.Donuts
import com.cheesecake.donutz.model.MiniDonuts

data class HomeUIState (
    val mainDonuts: List<Donuts> = emptyList(),
    val miniDonuts: List<MiniDonuts> = emptyList()
)