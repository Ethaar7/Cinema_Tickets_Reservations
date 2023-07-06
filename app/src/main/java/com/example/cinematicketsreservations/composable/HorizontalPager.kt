package com.example.cinematicketsreservations.composable


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalFoundationApi::class)
@ExperimentalPagerApi
@Composable
fun AutoSliding() {
    val pagerState = rememberPagerState(
        pageCount = 2,
        initialOffscreenLimit = 2,
        infiniteLoop = true,
        initialPage = 1,
        )

//
//    LaunchedEffect(Unit) {
//        while (true) {
//            yield()
//            delay(200)
//            pagerState.animateScrollToPage(
//                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
//                animationSpec = tween(600)
//            )
//        }
//    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {

        Spacer(modifier = Modifier.height(30.dp))
        HorizontalPager(
            state = pagerState,
            modifier = Modifier,

//            contentPadding = PaddingValues(horizontal = 32.dp),
            itemSpacing = 16.dp

        ) { page ->
            Card(
                modifier = Modifier
                    .width(360.dp),
                shape = RoundedCornerShape(32.dp),

            ) {
                    Image(
                        painter = painterResource(
                            id = when (page) {
                                1 -> R.drawable.poster_film
                                2 -> R.drawable.poster_film2
                                3 -> R.drawable.fb3_poster_jude_law_full
                                4 -> R.drawable.aberforth_richard_coyle_scaled
                                5 -> R.drawable.s_l1600
                                else -> R.drawable.fb3_poster_jude_law_full
                            }
                        ),
                        contentDescription = "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize(),
                    )

            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true)
@Composable
fun loo() {
    AutoSliding()
}