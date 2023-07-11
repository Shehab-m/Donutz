package com.cheesecake.donutz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cheesecake.donutz.presentation.screens.donutDetails.DonutDetailsScreen
import com.cheesecake.donutz.ui.theme.DonutzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DonutzTheme {
                DonutDetailsScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DonutzTheme {

    }
}