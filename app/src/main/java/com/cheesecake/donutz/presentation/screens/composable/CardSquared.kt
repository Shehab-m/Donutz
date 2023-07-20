package com.cheesecake.donutz.presentation.screens.composable

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardSquared(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    color: Color = White,
    content: @Composable ColumnScope.() -> Unit = {}
) {
    Card(
        modifier = modifier.size(45.dp),
        colors = CardDefaults.cardColors(color),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        onClick = onClick,
        content = content
    )
}
