package com.cheesecake.donutz.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.R
import com.cheesecake.donutz.navigation.LocalNavController
import com.cheesecake.donutz.navigation.navigateToDonutDetailsScreen
import com.cheesecake.donutz.presentation.screens.composable.SmallCardWithIcon
import com.cheesecake.donutz.presentation.screens.home.composable.DonutDetailsCard
import com.cheesecake.donutz.presentation.screens.home.composable.DonutsItem
import com.cheesecake.donutz.presentation.screens.home.composable.FavouriteIcon
import com.cheesecake.donutz.ui.theme.Black
import com.cheesecake.donutz.ui.theme.Blue
import com.cheesecake.donutz.ui.theme.Grey
import com.cheesecake.donutz.ui.theme.Pink
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun HomeScreen() {

    val navController =  LocalNavController.current

    HomeContent(onClickDonutDetails = { navController.navigateToDonutDetailsScreen() })
}

@Composable
fun HomeContent(
    onClickDonutDetails: ()-> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(White)
    ) {

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 60.dp, end = 40.dp, start = 40.dp),
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

            SmallCardWithIcon(
                icon = painterResource(id = R.drawable.search_4_svgrepo_com),
                onClick = {},
                cardBackGroundColor = Pink,
            )
        }

        Text(
            text = stringResource(R.string.today_offers),
            style = Typography.titleSmall,
            modifier = Modifier.padding(start = 40.dp, top = 40.dp)
        )

        LazyRow(
            modifier = Modifier.padding(top = 20.dp),
            contentPadding = PaddingValues(start = 40.dp)
        ) {
            items(4) {
                DonutDetailsCard(
                    image = painterResource(id = R.drawable.sterowbarry_wheel),
                    name = "Strawberry Wheel",
                    details = "These Baked Strawberry Donuts are filled with fresh strawberries.........",
                    oldPrice = 20,
                    price = 16,
                    backGroundColor = Blue,
                    onClick = onClickDonutDetails
                )
            }
        }

        Text(
            text = "Donuts",
            style = Typography.titleSmall,
            modifier = Modifier.padding(start = 40.dp, top = 40.dp)
        )

        LazyRow(
            modifier = Modifier.padding(top = 20.dp),
            contentPadding = PaddingValues(horizontal = 40.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ){
            items(6){
                DonutsItem(
                    image = painterResource(id = R.drawable.donut_black),
                    name = "Chocolate Cherry",
                    price = 22,
                    onClick = {}
                )
            }
        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
