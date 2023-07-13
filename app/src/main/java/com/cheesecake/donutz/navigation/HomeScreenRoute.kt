package com.cheesecake.donutz.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.donutz.presentation.screens.home.HomeScreen


fun NavController.navigateToHomeScreen() {
    navigate(ScreensRoute.Home.route)
}

fun NavGraphBuilder.HomeScreenRoute() {
    composable(
        route = ScreensRoute.Home.route

    ) { HomeScreen() }
}
