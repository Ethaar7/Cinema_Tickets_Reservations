package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R

@Composable
fun Clock(color: Color) {
    Row(
        modifier = Modifier
            .padding(top = 16.dp, end = 16.dp)
            .clip(CircleShape)
            .background(Color.White.copy(alpha = 0.3f)),
    ) {
        Icon(
            painter = painterResource(R.drawable.clock_circle),
            contentDescription = "clock icon",
            modifier = Modifier
                .padding(8.dp),
            tint = color,
        )
        Text(
            text = "2h 23m",
            color = color,
            modifier = Modifier
                .padding(
                    top = 8.dp,
                    bottom = 8.dp,
                    end = 8.dp
                )
                .align(Alignment.CenterVertically)
        )
    }
}