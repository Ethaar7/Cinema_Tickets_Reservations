package com.example.cinematicketsreservations.ui.theme

import com.example.cinematicketsreservations.R

sealed class Screen(val rout: String, val title: String, val icon: Int) {

    object HomeScreen : Screen(
        rout = "HomeScreen",
        title = "",
        icon = R.drawable.clapperboard_play,
    )

    object SearchScreen : Screen(
        rout = "Favorite",
        title = "",
        icon = R.drawable.minimalistic_magnifer,
    )


    object TicketScreen :
        Screen(rout = "Buy", title = "", icon = R.drawable.ticket)

    object ProfileScreen :
        Screen(
            rout = "Profile",
            title = "",
            icon = R.drawable.user,
        )

    object DetailsScreen : Screen(rout = "DetailsScreen", title = "", icon = 0)

}