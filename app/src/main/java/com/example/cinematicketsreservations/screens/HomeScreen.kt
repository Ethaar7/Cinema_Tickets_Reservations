package com.example.cinematicketsreservations.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.composable.AutoSliding
import com.example.cinematicketsreservations.composable.BottomNavigation
import com.example.cinematicketsreservations.composable.Clock
import com.example.cinematicketsreservations.composable.Description
import com.example.cinematicketsreservations.composable.Shape
import com.example.cinematicketsreservations.composable.chipGroup
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {

    Column(modifier = Modifier.fillMaxSize()) {

        Column {
            chipGroup(modifier = Modifier.padding(bottom = 16.dp))
            AutoSliding(
                images = listOf(
                    R.drawable.poster_film,
                    R.drawable.poster_film2,
                    R.drawable.fb3_poster_jude_law_full,
                    R.drawable.aberforth_richard_coyle_scaled,
                    R.drawable.s_l1600
                )
            )

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
fun Preview() {
    HomeScreen()
}
