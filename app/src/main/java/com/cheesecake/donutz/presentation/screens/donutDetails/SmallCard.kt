package com.cheesecake.donutz.presentation.screens.donutDetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.ui.theme.Black
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallCardWithText(
    text: String,
    textColor: Color = Black,
    backGroundColor: Color = White,
    onClick: () -> Unit,
    cardModifier: Modifier = Modifier
) {
    Card(
        modifier = cardModifier.size(45.dp),
        colors = CardDefaults.cardColors(backGroundColor),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        onClick = onClick
    ) {
        Box(modifier = Modifier.fillMaxSize())
        {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = text,
                style = Typography.labelMedium,
                textAlign = TextAlign.Center
            )
        }
    }

}