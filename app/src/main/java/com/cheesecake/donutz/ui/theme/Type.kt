package com.cheesecake.donutz.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cheesecake.donutz.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(500),
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(400),
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.7.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(700),
        fontSize = 54.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(600),
        fontSize = 30.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.5.sp
    ),
    titleSmall = TextStyle(
        fontFamily =FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(600),
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ) ,
    labelMedium = TextStyle(
        fontFamily =FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(500),
        fontSize = 22.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily =FontFamily(Font(R.font.inter_regular)),
        fontWeight = FontWeight(500),
        fontSize = 32.sp,
    ),

)