package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.ui.theme.Primary

@Composable
fun Bottom(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = { },
        modifier = Modifier.height(56.dp),
        colors = ButtonDefaults.buttonColors(Primary),
        shape = CircleShape
    ) {
        Icon(
            painter = painterResource(R.drawable.card),
            contentDescription = null,
            modifier.padding(end = 8.dp)
        )
        Text(text = text)
    }
}


@Preview
@Composable
fun jkkk() {
    Bottom(text = "jkkjgjg")
}
