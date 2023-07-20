package com.cheesecake.donutz.presentation.screens.donutDetails.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.cheesecake.donutz.R
import com.cheesecake.donutz.presentation.screens.composable.CardSquared
import com.cheesecake.donutz.ui.theme.Red

@Composable
fun CardFavouriteDonut(onClick: () -> Unit, modifier: Modifier = Modifier, isFavourite:Boolean) {
    CardSquared(
        onClick = onClick,
        modifier = modifier
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Icon(
                modifier = Modifier.align(Alignment.Center),
                painter = painterResource(
                    id = if (isFavourite) R.drawable.heart else R.drawable.heart_outline
                ),
                contentDescription = "favourite", tint = Red
            )
        }
    }
}