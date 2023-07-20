package com.cheesecake.donutz.presentation.screens.donutDetails.viewModel

import com.cheesecake.donutz.R
import com.cheesecake.donutz.presentation.base.BaseViewModel
import kotlinx.coroutines.flow.update

class DonutDetailsViewModel : BaseViewModel<DonutDetailsUIState>(DonutDetailsUIState()),
    DonutDetailsListener {

    init {
        _state.update {
            it.copy(
                R.drawable.sterowbarry_wheel,
                "Strawberry Wheel",
                "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                16,
                1,
                false
            )
        }
    }

    override fun onClickMinus() {
        if (_state.value.quantity > 0) _state.update {
            it.copy(
                quantity = it.quantity.minus(1), price = it.price - 16
            )
        }
    }

    override fun onClickPlus() {
        _state.update { it.copy(quantity = it.quantity.plus(1), price = it.price + 16) }
    }

    override fun onClickFavourite() {
        _state.update { it.copy(isFavourite = !it.isFavourite) }
    }

}