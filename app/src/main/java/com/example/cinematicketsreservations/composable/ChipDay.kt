package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematicketsreservations.ui.theme.Secondary
import com.example.cinematicketsreservations.ui.theme.SecondaryTextColor

@Composable
fun ChipDay() {
    var selected by remember { mutableStateOf("") }
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp),
    ) {
        val chipList: List<String> = listOf(
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "22"
        )

        val chipListText: List<String> = listOf(
            "Thu",
            "Fri",
            "Set",
            "Sun",
            "Mon",
            "Tus",
            "Sun",
            "Mon"
        )

        items(chipList) { title ->
            val index = chipList.indexOf(title)
            val text = chipListText.getOrNull(index) ?: ""
            ChipText(
                title = title,
                text = text,
                selected = selected,
                onSelected = { selected = it },
                color = Secondary
            )
        }
    }
}

@Composable
fun ChipText(
    title: String,
    text: String,
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
            .clip(RoundedCornerShape(40))
            .background(background)
            .border(
                width = 1.dp,
                color = if (isSelected) Color.Transparent else Color.LightGray,
                shape = RoundedCornerShape(40)
            )
            .clickable(
                onClick = {
                    onSelected(title)
                }
            ),
    ) {
        Column(Modifier.padding(8.dp)) {
            Text(
                text = title,
                color = contentColor,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            )

            Text(
                text = text,
                color = SecondaryTextColor,
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun kjkl() {
    ChipText(title = "14", text = "Thu", selected = "", onSelected = {}, color = Secondary)
}
