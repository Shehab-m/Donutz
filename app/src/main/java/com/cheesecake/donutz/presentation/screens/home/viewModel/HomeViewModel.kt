package com.cheesecake.donutz.presentation.screens.home.viewModel

import com.cheesecake.donutz.R
import com.cheesecake.donutz.model.Donuts
import com.cheesecake.donutz.model.MiniDonuts
import com.cheesecake.donutz.presentation.base.BaseViewModel
import kotlinx.coroutines.flow.update

class HomeViewModel : BaseViewModel<HomeUIState>(HomeUIState()),HomeInteractionListener {

    init {
        _state.update {
            it.copy(
                mainDonuts = listOf(
                    Donuts(
                        R.drawable.sterowbarry_wheel,
                        "Strawberry Wheel",
                        "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        20,
                        16,
                        false
                    ),
                    Donuts(
                        R.drawable.choco_wheel,
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
                        R.drawable.choco_wheel,
                        "Chocolate Glaze",
                        "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        26,
                        21,
                        false
                    ),
                ),
                miniDonuts = listOf(
                    MiniDonuts(R.drawable.donut_cherry,"Chocolate Cherry",22),
                    MiniDonuts(R.drawable.donut_rain,"Strawberry Rain",12),
                    MiniDonuts(R.drawable.donut_glaze,"Strawberry Glaze",16),
                    MiniDonuts(R.drawable.donut_cherry,"Chocolate Cherry",22),
                    MiniDonuts(R.drawable.donut_rain,"Strawberry Rain",12),
                    MiniDonuts(R.drawable.donut_glaze,"Strawberry Glaze",16),
                )
            )
        }
    }

    override fun onClickFavourite(position: Int) {
        _state.update {
            val donut = it.mainDonuts[position]
            val updatedDonuts = it.mainDonuts.toMutableList()
            updatedDonuts[position] = donut.copy(
                isFavourite = !donut.isFavourite
            )
            it.copy(mainDonuts = updatedDonuts)
        }
    }

}