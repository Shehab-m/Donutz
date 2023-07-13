package com.cheesecake.donutz.presentation.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.R
import com.cheesecake.donutz.presentation.screens.composable.CreateIndication
import com.cheesecake.donutz.presentation.screens.composable.CreateMutableInteractionSource
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun DonutsItem(image: Painter,onClick: ()-> Unit, name: String, price: Int,) {
    Box {
        Column(
            modifier = Modifier
                .width(138.dp)
                .height(111.dp)
                .shadow(
                    shape = RoundedCornerShape(
                        topEnd = 20.dp,
                        topStart = 20.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp
                    ), elevation = 2.dp
                )
                .background(White)
                .align(Alignment.BottomCenter).clickable(
                    interactionSource = CreateMutableInteractionSource(),
                    indication = CreateIndication(),
                    onClick = onClick
                ),
        verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = name,
                style = Typography.bodySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
            )

        }
        Text(
            text = "$${price}",
            color = Red,
            style = Typography.bodySmall,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter)
        )

        Image(
            painter = image,
            contentDescription ="donut",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(bottom = 60.dp)
                .size(100.dp)
        )
    }
}

@Preview
@Composable
fun DonutsItemPreview() {
    DonutsItem(
        image = painterResource(id = R.drawable.donut_black),
        name = "Chocolate Cherry",
        price = 22,
        onClick = {}
    )
}
//
//
//@Composable
//fun DonutsItem(image: Painter, name: String, price: Int) {
//    Box {
//        Card(
//            colors = CardDefaults.cardColors(White),
//            elevation = CardDefaults.cardElevation(10.dp),
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .clip(
//                    shape = RoundedCornerShape(
//                        topEnd = 20.dp,
//                        topStart = 20.dp,
//                        bottomEnd = 10.dp,
//                        bottomStart = 10.dp
//                    )
//                )
//                .width(138.dp)
//                .height(111.dp)
//
//        ) {
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center
//            ) {
//
//                Text(
//                    text = name,
//                    style = Typography.bodySmall,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier
//                        .padding(horizontal = 8.dp)
//                        .fillMaxWidth()
//                )
//
//            }
//        }
//        Image(
//            painter = image,
//            contentDescription = "donut",
//            modifier = Modifier
//                .align(Alignment.TopCenter)
//                .padding(bottom = 60.dp)
//                .size(100.dp)
//        )
//
//        Text(
//            text = "$${price}",
//            color = Red,
//            style = Typography.bodySmall,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .padding(bottom = 16.dp)
//                .align(Alignment.BottomCenter)
//        )
//    }
//
//
//}