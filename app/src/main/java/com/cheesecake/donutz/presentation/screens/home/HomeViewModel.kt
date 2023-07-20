package com.cheesecake.donutz.presentation.screens.home

import com.cheesecake.donutz.R
import com.cheesecake.donutz.model.Donuts
import com.cheesecake.donutz.presentation.base.BaseViewModel
import kotlinx.coroutines.flow.update

class HomeViewModel : BaseViewModel<HomeUIState>(HomeUIState()) {

    init {
        _state.update {
            it.copy(
                donuts = listOf(
                    Donuts(
                        R.drawable.sterowbarry_wheel,
                        "Strawberry Wheel",
                        "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        20,
                        16,
                        false
                    ),
                    Donuts(
                        R.drawable.strowbarry,
                        "Chocolate Glaze",
                        "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        26,
                        21,
                        false
                    ),
                    Donuts(
                        R.drawable.sterowbarry_wheel,
                        "Strawberry Wheel",
                        "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        20,
                        16,
                        false
                    ),
                    Donuts(
                        R.drawable.strowbarry,
                        "Chocolate Glaze",
                        "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        26,
                        21,
                        false
                    ),
                )
            )
        }
    }

}