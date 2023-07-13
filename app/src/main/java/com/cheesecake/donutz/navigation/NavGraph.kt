package com.cheesecake.donutz.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

val LocalNavController = compositionLocalOf<NavHostController> { error("No active user found!") }
private const val START_ROUTE = "onBoarding"

@Composable
fun NavGraph(navController: NavHostController) {

    CompositionLocalProvider(LocalNavController provides navController) {
        NavHost(navController = navController, startDestination = START_ROUTE) {
            HomeScreenRoute()
            OnBoardingScreenRoute()
            DonutDetailsScreenRoute()
        }
    }

}


