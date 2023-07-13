package com.cheesecake.donutz.navigation

import com.cheesecake.donutz.R

sealed class ScreensRoute(
    val route: String,
    val icon: Int
) {
    object Home : ScreensRoute(
        route = "homeScreen",
        icon = R.drawable.home
    )

    object Favourite : ScreensRoute(
        route = "favourite",
        icon = R.drawable.heart
    )

    object Notification : ScreensRoute(
        route = "bookingScreen",
        icon = R.drawable.notification
    )

    object Shop : ScreensRoute(
        route = "shop",
        icon = R.drawable.buy
    )

    object Profile : ScreensRoute(
        route = "profile",
        icon = R.drawable.mingcute_user_2_line
    )

}