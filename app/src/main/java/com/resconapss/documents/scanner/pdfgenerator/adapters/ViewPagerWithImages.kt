package com.resconapss.documents.scanner.pdfgenerator.adapters

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.resconapss.documents.scanner.pdfgenerator.utills.Config.Companion.images

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ViewPagerWithImages() {

    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()

    HorizontalPager(
        state = pagerState,
        count = images.size,
        modifier = Modifier.fillMaxSize()
    ) {
        page ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {

            Image(
                painter = painterResource(id = images[page]),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )


            // Display the current page number
            Button(onClick = {

            },modifier = Modifier
                .width(100.dp)
                .height(40.dp)
                .align(Alignment.BottomCenter)) {
                Text(text = "page:${pagerState.currentPage + 1}"
                    ,color = Color.White, )

            }

           /* Text(
                text = "Page ${pagerState.currentPage + 1}",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(top = 16.dp)
            )*/
        }
    }
}