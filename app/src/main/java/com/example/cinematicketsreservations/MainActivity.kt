package com.example.cinematicketsreservations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinematicketsreservations.composable.AutoSliding
import com.example.cinematicketsreservations.composable.BottomNavigation
import com.example.cinematicketsreservations.composable.chipGroup
import com.example.cinematicketsreservations.screens.BuyTicketsScreen
import com.example.cinematicketsreservations.screens.DetailsScreen
import com.example.cinematicketsreservations.screens.HomeScreen
import com.example.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            chipGroup()
//            AutoSliding()
//            BottomNavigation()
//            DetailsScreen()
            BuyTicketsScreen()
//            HomeScreen()

        }
    }
}


