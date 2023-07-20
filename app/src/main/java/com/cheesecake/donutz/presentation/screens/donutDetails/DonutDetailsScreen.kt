package com.cheesecake.donutz.presentation.screens.donutDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.donutz.R
import com.cheesecake.donutz.navigation.LocalNavController
import com.cheesecake.donutz.presentation.screens.composable.BackButton
import com.cheesecake.donutz.presentation.screens.composable.CardSquared
import com.cheesecake.donutz.presentation.screens.donutDetails.composable.RowQuantity
import com.cheesecake.donutz.presentation.screens.donutDetails.viewModel.DonutDetailsListener
import com.cheesecake.donutz.presentation.screens.donutDetails.viewModel.DonutDetailsUIState
import com.cheesecake.donutz.presentation.screens.donutDetails.viewModel.DonutDetailsViewModel
import com.cheesecake.donutz.ui.theme.Pink
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun DonutDetailsScreen(
    viewModel: DonutDetailsViewModel = hiltViewModel()
) {
    val navController = LocalNavController.current
    val state by viewModel.state.collectAsState()
    DonutDetailsContent(state, navController::navigateUp, viewModel)
}

@Composable
fun DonutDetailsContent(
    state: DonutDetailsUIState, onClickBack: () -> Unit, listener: DonutDetailsListener
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize().background(Pink)
    ) {
        val (bottomSheet, mainImage, cardFavourite) = createRefs()

        BackButton(onClickBack)
        Image(painter = painterResource(id = state.imageId),
            contentDescription = "donut",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
                .constrainAs(mainImage) { top.linkTo(parent.top, 28.dp) })
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                .background(White)
                .constrainAs(bottomSheet) { bottom.linkTo(parent.bottom) },
        ) {
            Text(
                modifier = Modifier.padding(start = 40.dp, top = 35.dp),
                text = state.name,
                style = Typography.titleMedium, color = Red
            )
            Text(
                modifier = Modifier.padding(start = 40.dp, top = 33.dp),
                text = stringResource(R.string.about_gonut),
                style = Typography.bodyLarge,
            )
            Text(
                modifier = Modifier.padding(start = 40.dp, end = 40.dp, top = 16.dp),
                text = state.details,
                style = Typography.bodySmall
            )
            Text(
                modifier = Modifier.padding(start = 40.dp, top = 26.dp),
                text = stringResource(R.string.quantity),
                style = Typography.bodyLarge,
            )
            RowQuantity(state.quantity, listener::onClickMinus, listener::onClickPlus)
            Row(
                modifier = Modifier.padding(horizontal = 40.dp, vertical = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "£${state.price}",
                    style = Typography.titleMedium,
                    modifier = Modifier.padding(end = 16.dp).weight(1f)
                )
                Button(modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f),
                    colors = ButtonDefaults.buttonColors(Red),
                    onClick = {}) {
                    Text(
                        modifier = Modifier.padding(vertical = 10.dp),
                        text = "Add to Cart",
                        color = White,
                        style = Typography.titleSmall
                    )
                }
            }
        }

        CardSquared(
            onClick = listener::onClickFavourite,
            modifier = Modifier.constrainAs(cardFavourite) {
            top.linkTo(bottomSheet.top)
            bottom.linkTo(bottomSheet.top)
            end.linkTo(parent.end, 33.dp)
        }
        ) {
            Box(modifier = Modifier.fillMaxSize()
                ) {
                Icon(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(
                        id = if (state.isFavourite) R.drawable.heart else R.drawable.heart_outline
                    ),
                    contentDescription = "favourite", tint = Red
                )
            }
        }

    }
}


@Preview
@Composable
fun DonutDetailsScreenPreview() {
    DonutDetailsScreen()
}