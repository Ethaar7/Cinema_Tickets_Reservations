package com.example.cinematicketsreservations.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.composable.Bottom
import com.example.cinematicketsreservations.composable.ChipDay
import com.example.cinematicketsreservations.composable.ChipHour
import com.example.cinematicketsreservations.composable.Close
import com.example.cinematicketsreservations.composable.ShapeChair
import com.example.cinematicketsreservations.ui.theme.SecondaryTextColor
import com.example.cinematicketsreservations.ui.theme.What60


@Composable
fun BuyTicketsScreen(
//    viewModel: BuyViewModel = hiltViewModel(),
) {
//    val state by viewModel.state.collectAsState()
//    BuyTicketsContent(onClickSelected = viewModel::onClickSelected, state = state)
    BuyTicketsContent()
}


@Composable
fun BuyTicketsContent(
//    onClickSelected: (BuyUiState) -> Unit,
//    state: BuyUiState
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {

        Column() {
            Close()
            Image(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(350.dp)
                    .padding(top = 8.dp)
            )
            ShapeChair()
            ShapeChair()
            ShapeChair()


            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(32.dp),
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.ellipse_1),
                            contentDescription = null,
                            modifier = Modifier.align(
                                Alignment.CenterVertically
                            )
                        )
                        Text(text = "Available", color = What60)
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.ellipse_3),
                            contentDescription = null,
                            modifier = Modifier.align(
                                Alignment.CenterVertically
                            )
                        )
                        Text(text = "Taken", color = What60)
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.ellipse_2),
                            contentDescription = null,
                            modifier = Modifier.align(
                                Alignment.CenterVertically
                            )
                        )
                        Text(text = "Selected", color = What60)
                    }


                }
            }
        }

        Box(
            modifier = Modifier
                .height(250.dp)
                .background(
                    shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp),
                    color = Color.White
                )
        ) {
            Column() {
                ChipDay()
                ChipHour()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.padding(4.dp)) {
                        Text(
                            text = stringResource(R.string._100_00),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = stringResource(R.string._4_tickets),
                            fontSize = 12.sp,
                            color = SecondaryTextColor
                        )
                    }

                    Bottom(text = stringResource(R.string.buy_tickets))
                }

            }
        }

    }


}


@Preview(showSystemUi = true)
@Composable
fun kjjkghhkkjh() {
    BuyTicketsScreen()
}