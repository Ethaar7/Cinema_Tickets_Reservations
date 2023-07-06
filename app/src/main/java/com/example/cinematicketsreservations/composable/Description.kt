package com.example.cinematicketsreservations.composable

import android.util.EventLogTags.Description
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
fun DescriptionText(){
    Text(
        text = "Professor Albus Dumbledore knows the powerful. dark wizard Gellert Grindelwald is moving to selze control of the wizarding world. Unable to stop him…",
        modifier = Modifier.padding(top = 16.dp, start = 24.dp, end = 24.dp)
    )
}

