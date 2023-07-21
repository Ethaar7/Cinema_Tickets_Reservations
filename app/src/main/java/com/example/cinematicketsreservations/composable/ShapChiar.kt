package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.ui.theme.Primary
import com.example.cinematicketsreservations.ui.theme.What60

@Composable
fun ShapeChair(
    modifier: Modifier = Modifier,
//               state: BuyUiState, onClickSelected: () -> Unit
) {
    Box(
        modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                painter = painterResource(R.drawable.frame_rrrrr),
                contentDescription = "chair Icon",
                modifier = modifier
                    .size(100.dp)
                    .clickable { },
                tint = Color.White
            )
            Icon(
                painter = painterResource(R.drawable.frame_cccc),
                contentDescription = "chair Icon",
                modifier = modifier.size(110.dp),
                tint = Primary,
            )
            Icon(
                painter = painterResource(R.drawable.frame_lololo),
                contentDescription = "close Icon",
                modifier = modifier.size(110.dp),
                tint = What60
            )
        }
    }
}

