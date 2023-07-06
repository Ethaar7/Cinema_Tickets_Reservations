package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.ui.theme.SecondaryTextColor

@Composable
fun ShapedChip(
    text: String,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .border(
                width = 1.dp,
                color = SecondaryTextColor,
                shape = CircleShape
            ),
        shape = CircleShape
    ) {
        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, end = 8.dp, start = 8.dp)
        )
    }
}

@Composable
fun Shape(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        ShapedChip(text = "Fantasy")
        ShapedChip(text = "Adventure")
    }
}


@Preview
@Composable
fun hhj() {
    ShapedChip(text = "hggjhgjsjdhfkjdjh")
}