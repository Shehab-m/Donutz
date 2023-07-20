package com.cheesecake.donutz.presentation.screens.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardSmallWithIcon(
    icon: Painter,
    iconColor: Color = Red,
    cardBackGroundColor: Color = White,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.size(45.dp),
        colors = CardDefaults.cardColors(cardBackGroundColor),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        onClick = onClick
    ) {
        Box(modifier = Modifier.fillMaxSize())
        {
            Icon(
                modifier = Modifier.align(Alignment.Center),
                painter = icon,
                contentDescription = "favourite",
                tint = iconColor
            )
        }
    }

}