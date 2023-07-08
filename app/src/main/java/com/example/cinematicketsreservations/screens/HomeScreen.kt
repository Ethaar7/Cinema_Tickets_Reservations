package com.example.cinematicketsreservations.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.composable.AutoSliding
import com.example.cinematicketsreservations.composable.BottomNavigation
import com.example.cinematicketsreservations.composable.Clock
import com.example.cinematicketsreservations.composable.Description
import com.example.cinematicketsreservations.composable.ImageBlur
import com.example.cinematicketsreservations.composable.Shape
import com.example.cinematicketsreservations.composable.chipGroup
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(homeUiState: HomeUiState) {

    Column(modifier = Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState(
            initialPage = 1,
        )
        Box() {
            ImageBlur(pagerState, homeUiState)
            Column {
                chipGroup(modifier = Modifier.padding(bottom = 16.dp))
                AutoSliding(
                    images = homeUiState.imageUrl, pagerState = pagerState
                )
            }
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
    HomeScreen(HomeUiState())
}
