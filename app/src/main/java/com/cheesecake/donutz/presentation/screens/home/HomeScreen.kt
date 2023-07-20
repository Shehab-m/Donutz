package com.cheesecake.donutz.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.donutz.R
import com.cheesecake.donutz.navigation.LocalNavController
import com.cheesecake.donutz.navigation.navigateToDonutDetailsScreen
import com.cheesecake.donutz.presentation.screens.home.composable.CardDonutDetails
import com.cheesecake.donutz.presentation.screens.home.composable.DonutsItem
import com.cheesecake.donutz.presentation.screens.home.composable.RowHomeHeader
import com.cheesecake.donutz.presentation.screens.home.viewModel.HomeInteractionListener
import com.cheesecake.donutz.presentation.screens.home.viewModel.HomeUIState
import com.cheesecake.donutz.presentation.screens.home.viewModel.HomeViewModel
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val navController = LocalNavController.current
    HomeContent(state,onClickDonutDetails = { navController.navigateToDonutDetailsScreen() },viewModel)
}

@Composable
fun HomeContent(
    state: HomeUIState,
    onClickDonutDetails: ()-> Unit,
    listener: HomeInteractionListener
) {

    Column(
        Modifier
            .fillMaxSize()
            .background(White)
    ) {
        RowHomeHeader()
        Text(
            text = stringResource(R.string.today_offers),
            style = Typography.titleSmall,
            modifier = Modifier.padding(start = 40.dp, top = 40.dp)
        )
        LazyRow(
            modifier = Modifier.padding(top = 20.dp),
            contentPadding = PaddingValues(start = 40.dp)
        ) {
            itemsIndexed(state.mainDonuts) { index, item ->
                CardDonutDetails(
                    image = painterResource(id = item.imageId),
                    name = item.name,
                    details = item.details,
                    oldPrice = item.oldPrice,
                    price = item.price,
                    index = index,
                    onClickDonut = onClickDonutDetails,
                    isFavourite = item.isFavourite,
                    onClickFavourite = { listener.onClickFavourite(index) }
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
            items(state.miniDonuts){
                DonutsItem(
                    image = painterResource(id = it.imageId),
                    name = it.name,
                    price = it.price,
                    onClick = onClickDonutDetails
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
