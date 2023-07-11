package com.cheesecake.donutz.presentation.screens.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.R
import com.cheesecake.donutz.ui.theme.Red_Light

@Composable
fun BackButton() {
    IconButton(
        modifier = Modifier.padding(top = 45.dp, start = 32.dp),
        onClick = {}
    ) {
        Icon(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back button",
            tint = Red_Light
        )
    }
}