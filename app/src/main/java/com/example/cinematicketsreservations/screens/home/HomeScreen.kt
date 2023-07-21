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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.cinematicketsreservations.composable.AutoSliding
import com.example.cinematicketsreservations.composable.Clock
import com.example.cinematicketsreservations.composable.Description
import com.example.cinematicketsreservations.composable.ImageBlur
import com.example.cinematicketsreservations.composable.Shape
import com.example.cinematicketsreservations.composable.chipGroup
import com.example.cinematicketsreservations.screens.home.HomeUiState
import com.example.cinematicketsreservations.ui.theme.Screen
import com.google.accompanist.pager.ExperimentalPagerApi


@Composable
fun HomeScreen(
    navController: NavController,
) {
    HomeContent(homeUiState = HomeUiState(), onClick = {
        navController.navigate(Screen.DetailsScreen.rout)
    })
}


@OptIn(ExperimentalPagerApi::class, ExperimentalFoundationApi::class)
@Composable
fun HomeContent(homeUiState: HomeUiState, onClick: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val pagerState = rememberPagerState(
            initialPage = 1,
        )
        Box() {
            ImageBlur(pagerState, homeUiState)
            Column {
                chipGroup(modifier = Modifier.padding(bottom = 16.dp))
                AutoSliding(
                    images = homeUiState.imageUrl, pagerState = pagerState,
                    onClick = { onClick() }
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
    }
}


