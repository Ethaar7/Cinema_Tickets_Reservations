package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematicketsreservations.ui.theme.Primary
import com.example.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.example.cinematicketsreservations.ui.theme.Secondary

@Composable
fun chipGroup() {

    val chipList: List<String> = listOf(
        "Now Showing",
        "Coming Soon"
    )

    var selected by remember { mutableStateOf("") }


    Row(
        modifier = Modifier
            .padding(top = 24.dp, start = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {


        chipList.forEach { it ->
            Chip(title = it, selected = selected, onSelected = {
                selected = it
            }, color = Primary)
        }
    }
}

@Composable
fun Chip(
    title: String,
    selected: String,
    onSelected: (String) -> Unit,
    modifier: Modifier = Modifier,
    color: Color
) {

    val isSelected = selected == title
    val background = if (isSelected) color else Color.Transparent
    val contentColor = if (isSelected) Color.White else Color.Black

    Box(
        modifier = Modifier
            .wrapContentSize()
            .clip(CircleShape)
            .background(background)
            .border(
                width = 1.dp,
                color = if (isSelected) Transparent else Color.LightGray,
                shape = CircleShape
            )
            .clickable(
                onClick = {
                    onSelected(title)
                }
            ),
    ) {
        Text(
            text = title,
            color = contentColor,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun lkh() {
    chipGroup()
}