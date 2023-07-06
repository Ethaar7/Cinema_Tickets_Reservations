package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.ui.theme.Primary

@Composable
fun IconPlay(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(top = 16.dp, start = 16.dp)
            .size(40.dp)
            .clip(CircleShape)
            .background(Primary),
    ) {
        Icon(
            painter = painterResource(R.drawable.play),
            contentDescription = "play icon",
            modifier = Modifier.align(Alignment.Center),
            tint = Color.White,
        )
    }
}
