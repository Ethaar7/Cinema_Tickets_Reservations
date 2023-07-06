package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.ui.theme.Secondary

@Composable
fun ChipHour() {


    var selected by remember { mutableStateOf("") }

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp),
    ) {
        val chipList: List<String> = listOf(
            "10:00",
            "12:30",
            "15:30",
            "18:30",
            "21:30",
            "22:30",
            "23:00",
            "00:30"
        )


        items(chipList) {

            Chip(title = it, selected = selected, onSelected = {
                selected = it
            }, color = Secondary)

        }
    }

}