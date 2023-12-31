package com.cheesecake.donutz.presentation.screens.composable

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.cheesecake.donutz.ui.theme.Black

@Composable
fun CreateMutableInteractionSource(): MutableInteractionSource = remember {
    MutableInteractionSource()
}

@Composable
fun CreateIndication(
    bounded: Boolean = true, color: Color = Black
) = rememberRipple(bounded = bounded, color = color)
