package com.example.cinematicketsreservations.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.composable.ActorItem
import com.example.cinematicketsreservations.composable.Bottom
import com.example.cinematicketsreservations.composable.Clock
import com.example.cinematicketsreservations.composable.Close
import com.example.cinematicketsreservations.composable.Description
import com.example.cinematicketsreservations.composable.DescriptionText
import com.example.cinematicketsreservations.composable.IconPlay
import com.example.cinematicketsreservations.composable.Shape
import com.example.cinematicketsreservations.composable.TextContent

@Composable
fun DetailsScreen(
    navController: NavController,
) {
    DetailsContent()
}

@Preview(showSystemUi = true)
@Composable
fun DetailsContent() {


    Box(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.fantastic_beasts_3_3),
                contentDescription = "image film",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                contentScale = ContentScale.Crop
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Close()
                Clock(color = Color.White)
            }

            IconPlay(modifier = Modifier.padding(150.dp))
        }

        Box(
            modifier = Modifier
                .height(470.dp)
                .align(Alignment.BottomCenter)
                .background(
                    shape = AbsoluteRoundedCornerShape(topLeft = 32.dp, topRight = 32.dp),
                    color = Color.White
                )
        ) {

            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    TextContent(
                        text = stringResource(R.string._6_8_10),
                        subText = stringResource(R.string.imdb)
                    )
                    TextContent(
                        text = stringResource(R.string._63),
                        subText = stringResource(R.string.rotten_tomatoes)
                    )
                    TextContent(
                        text = stringResource(R.string._4_10),
                        subText = stringResource(R.string.ign)
                    )
                }

                Description(
                    text = stringResource(R.string.fantastic_beasts_the_secret_of_dumbledore),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Shape()

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(horizontal = 32.dp),
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    item {
                        ActorItem(painter = painterResource(R.drawable.licensed_image))
                        ActorItem(painter = painterResource(R.drawable.licensed_image__1_))
                        ActorItem(painter = painterResource(R.drawable.licensed_image__2_))
                        ActorItem(painter = painterResource(R.drawable.licensed_image__3_))
                        ActorItem(painter = painterResource(R.drawable.licensed_image__4_))
                        ActorItem(painter = painterResource(R.drawable.images))
                        ActorItem(painter = painterResource(R.drawable.licensed_image))
                        ActorItem(painter = painterResource(R.drawable.licensed_image))
                        ActorItem(painter = painterResource(R.drawable.licensed_image))
                        ActorItem(painter = painterResource(R.drawable.licensed_image))
                        ActorItem(painter = painterResource(R.drawable.licensed_image))
                    }
                }

                DescriptionText()
                Spacer(modifier = Modifier.padding(8.dp))
                Bottom(
                    text = stringResource(R.string.booking),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                )

            }
        }

    }
}
