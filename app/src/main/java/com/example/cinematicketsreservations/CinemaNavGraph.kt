package com.example.cinematicketsreservations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cinematicketsreservations.screens.BuyTicketsScreen
import com.example.cinematicketsreservations.screens.HomeScreen
import com.example.cinematicketsreservations.screens.SearchScreen
import com.example.cinematicketsreservations.screens.details.detailsRoute
import com.example.cinematicketsreservations.ui.theme.Screen


@ExperimentalMaterialApi
@Composable
fun CinemaNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.rout
    ) {
        composable(Screen.HomeScreen.rout) {
            HomeScreen(navController)
        }
        detailsRoute(navController)
        composable(Screen.TicketScreen.rout) {
            BuyTicketsScreen()
        }
        composable(Screen.SearchScreen.rout) {
            SearchScreen()
        }
        composable(Screen.ProfileScreen.rout) {
            ProfileScreen()
        }

    }
}
