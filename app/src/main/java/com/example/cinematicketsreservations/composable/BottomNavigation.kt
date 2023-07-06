package com.example.cinematicketsreservations.composable

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.screens.BuyTicketsScreen
import com.example.cinematicketsreservations.screens.HomeScreen
import androidx.compose.material.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.cinematicketsreservations.ui.theme.NavigationBottom
import com.example.cinematicketsreservations.ui.theme.NavigationBottom.Home.icon
import com.example.cinematicketsreservations.ui.theme.NavigationBottom.Profile.icon
import com.example.cinematicketsreservations.ui.theme.NavigationBottom.Search.icon
import com.example.cinematicketsreservations.ui.theme.NavigationBottom.Ticket.icon
import com.example.cinematicketsreservations.ui.theme.bottomNavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavigation() {
//    val navController = rememberNavController()

    var bottomState by remember {
        mutableStateOf("Home")
    }
    Scaffold(
        bottomBar = {

            BottomNavigation(backgroundColor = Color.White) {

                BottomNavigationItem(selected = bottomState == "Home",
                    onClick = { bottomState = "Home" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.clapperboard_play),
                            contentDescription = null
                        )
                    }
                )


                BottomNavigationItem(selected = bottomState == "Search",
                    onClick = { bottomState = "Search" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.minimalistic_magnifer),
                            contentDescription = null
                        )
                    }
                )


                BottomNavigationItem(selected = bottomState == "Tickets",
                    onClick = { bottomState = "Tickets" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.ticket),
                            contentDescription = null
                        )
                    }
                )

                BottomNavigationItem(selected = bottomState == "Profile",
                    onClick = { bottomState = "Profile" },
                    label = { Text(text = "") },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.user),
                            contentDescription = null
                        )
                    }
                )
            }
        }) {}
}


//            AppBottomNavigation(navController, bottomNavigationItem)
//        }
//    ) {
//        NavHost(
//            navController = navController,
//            startDestination = NavigationBottom.Home.screen_route
//        ) {
//            composable(NavigationBottom.Home.screen_route) {
//                HomeScreen()
//            }
//            composable(NavigationBottom.Search.screen_route) {
//
//            }
//
//            composable(NavigationBottom.Ticket.screen_route) {
//            }
//
//            composable(NavigationBottom.Profile.screen_route) {
//
//            }
//
//        }

//    }
//}

//@Composable
//fun AppBottomNavigation(
//    navController: NavController,
//    bottomNavigationItem: List<NavigationBottom>
//) {
//    BottomNavigation(Modifier.background(Color.White)) {
//        bottomNavigationItem.forEach { screen ->
//            BottomNavigationItem(
//                icon = {
//                    Icon(
//                        painter = painterResource(id = NavigationBottom.Home.icon),
//                        contentDescription = null
//                    )
//                },
//                label = {
//                    Text(text = screen.screen_route)
//                },
//                selected = false, alwaysShowLabel = false, onClick = {}
//            )
//
//        }
//    }
//}





