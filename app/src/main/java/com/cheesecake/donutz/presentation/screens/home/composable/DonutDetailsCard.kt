package com.cheesecake.donutz.presentation.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.donutz.R
import com.cheesecake.donutz.ui.theme.Blue
import com.cheesecake.donutz.ui.theme.Grey
import com.cheesecake.donutz.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutDetailsCard(
    image: Painter,
    name: String,
    details: String,
    oldPrice:Int,
    price: Int,
    backGroundColor: Color,
    onClick: ()-> Unit
) {
    Box {
        Card(
            modifier = Modifier.width(193.dp).height(325.dp).clip(RoundedCornerShape(20.dp)),
            colors = CardDefaults.cardColors(backGroundColor),
            onClick = (onClick)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                FavouriteIcon()

                Column(modifier = Modifier.padding(start = 20.dp, end = 16.dp)) {
                    Text(text = name, style = Typography.bodyMedium)

                    Text(
                        text = details, color = Grey, style = Typography.labelSmall, maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = "$${oldPrice}", color = Grey, style = Typography.bodySmall,
                            textDecoration = TextDecoration.LineThrough,
                            modifier = Modifier.padding(bottom = 4.dp, end = 4.dp)
                        )
                        Text(text = "$${price}", style = Typography.labelMedium)
                    }
                }

            }
        }
        Image(
            modifier = Modifier.padding(start = 45.dp, top = 10.dp).size(220.dp),
            painter = image,
            contentDescription = "donut",
        )
    }
}

@Preview
@Composable
fun DonutDetailsCardPreview(){
    DonutDetailsCard(
        image = painterResource(id = R.drawable.sterowbarry_wheel),
        name = "Strawberry Wheel",
        details = "These Baked Strawberry Donuts are filled with fresh strawberries.........",
        oldPrice = 20,
        price = 16,
        backGroundColor = Blue,
        onClick = {}
    )
}
