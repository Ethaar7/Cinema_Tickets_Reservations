package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.example.cinematicketsreservations.ui.theme.SecondaryTextColor

@Composable
fun TextContent(text: String, subText: String,modifier: Modifier= Modifier) {
    Column(
        modifier = Modifier.wrapContentSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            modifier = modifier.padding(top = 16.dp),
            fontSize = 16.sp,
            color = PrimaryTextColor,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = subText,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 8.sp,
            color = SecondaryTextColor,
        )
    }
}

@Preview
@Composable
fun kkj() {
    TextContent(text = "6.8/10", subText = "IMDb")
}