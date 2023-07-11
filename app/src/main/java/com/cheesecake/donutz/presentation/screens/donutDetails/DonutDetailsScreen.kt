package com.cheesecake.donutz.presentation.screens.donutDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.donutz.R
import com.cheesecake.donutz.presentation.screens.composable.BackButton
import com.cheesecake.donutz.presentation.screens.composable.CreateIndication
import com.cheesecake.donutz.presentation.screens.composable.CreateMutableInteractionSource
import com.cheesecake.donutz.ui.theme.Black
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
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink)
    ) {

        val (bottomSheet, mainImage, iconFav) = createRefs()

        BackButton()

        Image(
            painter = painterResource(id = R.drawable.strowbarry),
            contentDescription = "donut",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
                .constrainAs(mainImage){
                    top.linkTo(parent.top,28.dp)
                }
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                .background(White)
                .constrainAs(bottomSheet) {
                    bottom.linkTo(parent.bottom)
                },
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

            Row(modifier = Modifier.padding(start = 40.dp, top = 19.dp)) {

                Card(modifier = Modifier
                    .padding(end = 20.dp)
                    .size(45.dp),
                    colors = CardDefaults.cardColors(White),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(2.dp),
                    onClick = {}
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                    {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "-",
                            style = Typography.labelLarge,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Card(modifier = Modifier
                    .padding(end = 20.dp)
                    .size(45.dp),
                    colors = CardDefaults.cardColors(White),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(2.dp),
                    onClick = {}
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                    {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "1",
                            style = Typography.labelMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Card(modifier = Modifier
                    .padding(end = 20.dp)
                    .size(45.dp),
                    colors = CardDefaults.cardColors(Black),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(2.dp),
                    onClick = {}
                ) {
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


            Row(
                modifier = Modifier.padding(horizontal = 40.dp, vertical = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "£16",
                    style = Typography.titleMedium,
                    modifier = Modifier.padding(end = 26.dp)
                )

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Red),
                    onClick = {}
                ) {

                    Text(
                        modifier = Modifier.padding(vertical = 10.dp),
                        text = "Add to Cart",
                        color = White,
                        style = Typography.titleSmall
                    )
                }

            }
        }



        Card(modifier = Modifier
//            .align(Alignment.CenterEnd)
            .size(45.dp)
            .constrainAs(iconFav) {
                top.linkTo(bottomSheet.top)
                bottom.linkTo(bottomSheet.top)
                end.linkTo(parent.end, 33.dp)
            },
            colors = CardDefaults.cardColors(White),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(2.dp),
            onClick = {}
        ) {
            Box(modifier = Modifier.fillMaxSize())
            {
                Icon(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(id = R.drawable.fav),
                    contentDescription = "favourite",
                    tint = Red
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