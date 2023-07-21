package com.example.cinematicketsreservations

import android.annotation.SuppressLint
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematicketsreservations.composable.BottomNavigationB
import com.example.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme

@ExperimentalMaterialApi
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaApp() {
    CinemaTicketsReservationsTheme() {
        Scaffold {
            val navController = rememberNavController()
            CinemaNavGraph(navController)
            BottomNavigationB()
        }
    }
}
