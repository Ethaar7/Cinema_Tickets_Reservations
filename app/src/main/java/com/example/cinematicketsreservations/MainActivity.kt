package com.example.cinematicketsreservations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cinematicketsreservations.screens.DetailsScreen
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            chipGroup()
//            AutoSliding()
//            BottomNavigation()
            DetailsScreen()
//            BuyTicketsScreen()
//            HomeScreen()

        }
    }
}


