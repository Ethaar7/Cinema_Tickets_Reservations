package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R

@Composable
fun Description(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier
            .padding(vertical = 8.dp)
            .width(240.dp),
        color = Color.Black,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun DescriptionText() {
    Text(
        text = stringResource(R.string.professor_albus_dumbledore_knows_the_powerful_dark_wizard_gellert_grindelwald_is_moving_to_selze_control_of_the_wizarding_world_unable_to_stop_him),
        modifier = Modifier.padding(top = 16.dp, start = 24.dp, end = 24.dp)
    )
}

