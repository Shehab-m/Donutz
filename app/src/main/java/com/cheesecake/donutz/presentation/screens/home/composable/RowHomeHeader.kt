package com.cheesecake.donutz.presentation.screens.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.R
import com.cheesecake.donutz.presentation.screens.composable.CardSquared
import com.cheesecake.donutz.ui.theme.Grey
import com.cheesecake.donutz.ui.theme.Pink
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Typography

@Composable
fun RowHomeHeader(modifier: Modifier = Modifier) {
    Row(modifier= modifier.fillMaxWidth().padding(top = 40.dp, end = 40.dp, start = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = stringResource(R.string.let_s_gonuts),
                style = Typography.titleMedium,
                color = Red
            )
            Text(
                text = stringResource(R.string.order_your_favourite_donuts_from_here),
                style = Typography.bodySmall,
                color = Grey
            )
        }
        CardSquared(color = Pink, modifier = modifier) {
            Box(modifier = Modifier.fillMaxSize())
            {
                Icon(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(id = R.drawable.search_4_svgrepo_com),
                    contentDescription = "favourite",
                    tint = Red
                )
            }
        }
    }
}