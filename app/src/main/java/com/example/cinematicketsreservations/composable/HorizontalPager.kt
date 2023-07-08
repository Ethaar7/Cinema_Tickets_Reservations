package com.example.cinematicketsreservations.composable


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi


@OptIn(ExperimentalFoundationApi::class)
@ExperimentalPagerApi
@Composable
fun AutoSliding(
    images: List<String>,
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {

    HorizontalPager(
        state = pagerState,
        modifier = Modifier,
        contentPadding = PaddingValues(horizontal = 32.dp),
        pageSpacing = 16.dp,
        pageCount = images.size
    ) {

        Image(
            painter = rememberAsyncImagePainter(model = images[it]),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .aspectRatio(3 / 4f)
                .clip(RoundedCornerShape(16))
        )

    }
}

//@OptIn(ExperimentalPagerApi::class)
//@Preview(showSystemUi = true)
//@Composable
//fun Preview() {
//    AutoSliding(
//        images = listOf(
//            R.drawable.poster_film,
//            R.drawable.poster_film2,
//            R.drawable.fb3_poster_jude_law_full,
//            R.drawable.aberforth_richard_coyle_scaled,
//            R.drawable.s_l1600
//        )
//    )
//}