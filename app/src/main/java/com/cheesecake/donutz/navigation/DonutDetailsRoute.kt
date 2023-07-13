package com.cheesecake.donutz.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.donutz.presentation.screens.donutDetails.DonutDetailsScreen
import com.cheesecake.donutz.presentation.screens.home.HomeScreen

private const val ROUTE = "donutDetails"

fun NavController.navigateToDonutDetailsScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.DonutDetailsScreenRoute() {
    composable(
        route = ROUTE

    ) { DonutDetailsScreen() }
}
