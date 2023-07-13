package com.cheesecake.donutz.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.donutz.presentation.screens.onBoarding.OnBoardingScreen

private const val ROUTE = "onBoarding"

fun NavGraphBuilder.OnBoardingScreenRoute() {
    composable(
        route = ROUTE

    ) { OnBoardingScreen() }
}
