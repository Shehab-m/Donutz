package com.cheesecake.donutz.presentation.screens.donutDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.cheesecake.donutz.R
import com.cheesecake.donutz.navigation.LocalNavController
import com.cheesecake.donutz.presentation.screens.composable.BackButton
import com.cheesecake.donutz.presentation.screens.composable.CardSmallWithIcon
import com.cheesecake.donutz.presentation.screens.composable.SmallCardWithText
import com.cheesecake.donutz.ui.theme.Black
import com.cheesecake.donutz.ui.theme.Pink
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun DonutDetailsScreen(
//    viewModel: DonutDetailsViewModel = hiltViewModel()
) {
//    val state by viewModel.state.collectAsState()
    val navController =  LocalNavController.current
    DonutDetailsContent { navController.navigateUp() }
}

@Composable
fun DonutDetailsContent(
    onClickBack: () -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink)
    ) {

        val (bottomSheet, mainImage, iconFav) = createRefs()

        BackButton(onClickBack)

        Image(
            painter = painterResource(id = R.drawable.strowbarry),
            contentDescription = "donut",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(mainImage) {
                    top.linkTo(parent.top, 28.dp)
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

                SmallCardWithText(
                    text = "-",
                    onClick = {},
                    modifier = Modifier.padding(end = 20.dp)
                )
                SmallCardWithText(
                    text = "1",
                    onClick = {},
                    textStyle = Typography.labelMedium,
                    modifier = Modifier.padding(end = 20.dp)
                )

                SmallCardWithText(
                    text = "+",
                    onClick = {},
                    cardBackGroundColor = Black,
                    textColor = White,
                    modifier = Modifier.padding(end = 20.dp)
                )

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

        CardSmallWithIcon(
            icon = painterResource(id = R.drawable.fav),
            onClick = {},
            modifier = Modifier.constrainAs(iconFav) {
                top.linkTo(bottomSheet.top)
                bottom.linkTo(bottomSheet.top)
                end.linkTo(parent.end, 33.dp)
            })

    }
}


@Preview
@Composable
fun DonutDetailsScreenPreview() {
    DonutDetailsScreen()
}