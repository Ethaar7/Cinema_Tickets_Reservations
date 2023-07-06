package com.example.cinematicketsreservations.ui.theme

import com.example.cinematicketsreservations.R

sealed class NavigationBottom(var title: String, var icon: Int, var screen_route: String) {

    object Home : NavigationBottom("Home", R.drawable.clapperboard_play, "home")
    object Search : NavigationBottom("Search", R.drawable.minimalistic_magnifer, "Search")
    object Ticket : NavigationBottom("Ticket", R.drawable.ticket, "ticket")
    object Profile : NavigationBottom("Profile", R.drawable.user, "profile")

}


val bottomNavigationItem = listOf(
    NavigationBottom.Home,
    NavigationBottom.Search,
    NavigationBottom.Ticket,
    NavigationBottom.Profile
)
