package com.cheesecake.donutz.presentation.screens.donutDetails.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.presentation.screens.composable.CardSquared
import com.cheesecake.donutz.ui.theme.Black
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun RowQuantity(quantity: Int, onClickMinus: () -> Unit, onClickPlus: () -> Unit) {
    Row(modifier = Modifier.padding(start = 40.dp, top = 19.dp)) {
        CardSquared(onClick = onClickMinus, modifier = Modifier.padding(end = 20.dp)) {
            Box(modifier = Modifier.fillMaxSize())
            {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "-",
                    style = Typography.labelLarge,
                    textAlign = TextAlign.Center,
                )
            }
        }
        CardSquared(modifier = Modifier.padding(end = 20.dp)) {
            Box(modifier = Modifier.fillMaxSize())
            {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "$quantity",
                    style = Typography.labelMedium,
                    textAlign = TextAlign.Center,
                )
            }
        }
        CardSquared(color = Black, onClick = onClickPlus) {
            Box(modifier = Modifier.fillMaxSize())
            {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "+",
                    style = Typography.labelLarge,
                    textAlign = TextAlign.Center,
                    color = White
                )
            }
        }
    }
}