package com.cheesecake.donutz.presentation.screens.onBoarding

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cheesecake.donutz.R
import com.cheesecake.donutz.navigation.LocalNavController
import com.cheesecake.donutz.navigation.navigateToHomeScreen
import com.cheesecake.donutz.presentation.screens.composable.CreateIndication
import com.cheesecake.donutz.presentation.screens.composable.CreateMutableInteractionSource
import com.cheesecake.donutz.ui.theme.Black
import com.cheesecake.donutz.ui.theme.Pink
import com.cheesecake.donutz.ui.theme.Red
import com.cheesecake.donutz.ui.theme.Red_Light
import com.cheesecake.donutz.ui.theme.Typography
import com.cheesecake.donutz.ui.theme.White

@Composable
fun OnBoardingScreen() {
    val navController =  LocalNavController.current
    OnBoardingContent(onClickGetStarted = { navController.navigateToHomeScreen() })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingContent(
    onClickGetStarted: () -> Unit
) {
    Box(modifier = Modifier.background(Pink)) {
        Image(
            modifier = Modifier.fillMaxHeight(.6f).fillMaxWidth(1.5f)
                .basicMarquee(
                    velocity = 100.dp,
                    initialDelayMillis = 0,
                    delayMillis = 0,
                    iterations = Int.MAX_VALUE
                ),
            painter = painterResource(id = R.drawable.group_donutz),
            contentDescription = "dounts",
            contentScale = ContentScale.FillHeight
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 40.dp),
                text = stringResource(R.string.gonuts_with_donuts),
                color = Red,
                style = Typography.titleLarge,
            )
            Text(
                modifier = Modifier.fillMaxWidth().padding(end = 40.dp, start = 40.dp, top = 19.dp),
                text = stringResource(R.string.onboarding_description),
                color = Red_Light,
                style = Typography.bodyLarge
            )
            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(end = 40.dp, start = 40.dp, bottom = 46.dp, top = 60.dp),
                colors = ButtonDefaults.buttonColors(White),
                onClick = onClickGetStarted
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 10.dp),
                    text = stringResource(R.string.get_started),
                    color = Black,
                    style = Typography.titleSmall
                )
            }
        }
    }
}


@Preview
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen()
}