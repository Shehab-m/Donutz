package com.cheesecake.donutz.presentation.screens.donutDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.donutz.R
import com.cheesecake.donutz.presentation.screens.composable.BackButton
import com.cheesecake.donutz.ui.theme.Grey
import com.cheesecake.donutz.ui.theme.Pink
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Red_Light
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun DonutDetailsScreen(
    viewModel: DonutDetailsViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    DonutDetailsContent(state)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutDetailsContent(state: DonutDetailsUIState) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink)
    ) {

        BackButton()

        Image(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .padding(top = 35.dp),
            painter = painterResource(id = R.drawable.strowbarry),
            contentDescription = "donut",
            contentScale = ContentScale.FillWidth
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .clip(shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                .background(White)
                .align(Alignment.BottomCenter),
        ) {

            Text(
                modifier = Modifier.padding(start = 40.dp, top = 35.dp),
                text = stringResource(R.string.strawberry_wheel),
                style = Typography.titleMedium,
                color = Red
            )

            Text(
                modifier = Modifier.padding(start = 40.dp, top = 33.dp),
                text = stringResource(R.string.about_gonut),
                style = Typography.bodyLarge,
            )

            Text(
                modifier = Modifier.padding(start = 40.dp, end = 40.dp, top = 16.dp),
                text = stringResource(R.string.strowbarry_details),
                style = Typography.bodySmall
            )

            Text(
                modifier = Modifier.padding(start = 40.dp, top = 26.dp),
                text = stringResource(R.string.quantity),
                style = Typography.bodyLarge,
            )

            Row(modifier = Modifier.padding(start = 40.dp, top = 20.dp)) {
                Card(modifier = Modifier
                    .padding(end = 33.dp)
                    .shadow(
                        elevation = 20.dp,
                        ambientColor = White,
                        spotColor = Grey,
                        shape = RoundedCornerShape(20.dp)
                    ),
                    colors = CardDefaults.cardColors(White),
                    shape = RoundedCornerShape(12.dp),
                    onClick = {}) {

                    Text(text = "-", fontSize = 32.sp, modifier = Modifier.padding(10.dp))
                }

            }

        }

        Card(modifier = Modifier
            .padding(end = 33.dp)
            .align(Alignment.CenterEnd)
            .shadow(
                elevation = 30.dp,
                ambientColor = White,
                spotColor = Grey,
                shape = RoundedCornerShape(24.dp)
            ),
            colors = CardDefaults.cardColors(White),
            shape = RoundedCornerShape(12.dp),
            onClick = {}) {

            Icon(
                modifier = Modifier.padding(8.dp),
                painter = painterResource(id = R.drawable.fav),
                contentDescription = "favourite",
                tint = Red
            )
        }



    }
}


@Preview
@Composable
fun DonutDetailsScreenPreview() {
    DonutDetailsScreen()
}