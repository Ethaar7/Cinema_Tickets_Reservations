package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R

@Composable
fun ShapeChair(modifier: Modifier = Modifier) {
    Box(
        modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement . SpaceEvenly
        ) {
            Icon(
                painter = painterResource(R.drawable.frame_7),
                contentDescription = "chair Icon",
                modifier = modifier.size(100.dp),
                tint = Color.White
            )
            Icon(
                painter = painterResource(R.drawable.frame_8),
                contentDescription = "chair Icon",
                modifier = modifier.size(100.dp),
                tint = Color.White
            )
            Icon(
                painter = painterResource(R.drawable.frame_9),
                contentDescription = "close Icon",
                modifier = modifier.size(100.dp),
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
fun hghj() {
    ShapeChair()
}