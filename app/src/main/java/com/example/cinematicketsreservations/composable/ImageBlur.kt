package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.cinematicketsreservations.screens.home.HomeUiState


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageBlur(
    pagerState: PagerState,
    homeUiState: HomeUiState
) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .blur(radius = 50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded),
        painter = rememberAsyncImagePainter(model = homeUiState.imageUrl[pagerState.currentPage]),
        contentScale = ContentScale.Crop,
        contentDescription = "Background",
    )
}