package com.cheesecake.donutz.navigation

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.White


@Composable
fun BottomNavBar(navController: NavHostController) {
    val screens = listOf(
        ScreensRoute.Home,
        ScreensRoute.Favourite,
        ScreensRoute.Notification,
        ScreensRoute.Shop,
        ScreensRoute.Profile,

        )
    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination
    Row(
        modifier = Modifier
            .padding(vertical = 20.dp, horizontal = 24.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        screens.forEach { screen ->
            AddRoute(
                screen = screen,
                currentDestination = currentDestination,
                onClick = {}
            )
        }
    }
}

@Composable
fun RowScope.AddRoute(
    screen: ScreensRoute,
    currentDestination: NavDestination?,
    onClick: () -> Unit
) {
    Icon(
        modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp),
        painter = painterResource(id = screen.icon),
        contentDescription = "icon",
        tint = Red
    )
}