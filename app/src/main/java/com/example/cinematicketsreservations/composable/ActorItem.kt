package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R

@Composable
fun ActorItem(
    painter: Painter,
    size: Dp = 56.dp,
    backgroundColor: Color = Color(0xFFF8F8F8),
) {
    Image(
        painter = painter,
        contentDescription = "Actor image",
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(color = backgroundColor),
        contentScale = ContentScale.Crop
    )
}