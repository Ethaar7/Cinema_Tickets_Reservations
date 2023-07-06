package com.example.cinematicketsreservations.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.composable.AutoSliding
import com.example.cinematicketsreservations.composable.BottomNavigation
import com.example.cinematicketsreservations.composable.Clock
import com.example.cinematicketsreservations.composable.Description
import com.example.cinematicketsreservations.composable.Shape
import com.example.cinematicketsreservations.composable.ShapedChip
import com.example.cinematicketsreservations.composable.TextContent
import com.example.cinematicketsreservations.composable.chipGroup
import com.example.cinematicketsreservations.ui.theme.Primary
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .height(450.dp)
                .background(
                    Brush.horizontalGradient(
                        listOf(Color.Transparent, Color.LightGray),
                        tileMode = TileMode.Mirror
                    )
                )
        ) {

                chipGroup()
                AutoSliding()

        }

        Column() {
            Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Clock(color = Color.Black)
            }

            Description(
                text = "Fantastic Beasts :The Secret of Dumbledore",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Shape()
        }

        BottomNavigation()
    }

}


@Preview(showSystemUi = true)
@Composable
fun hjgh() {
    HomeScreen()
}
