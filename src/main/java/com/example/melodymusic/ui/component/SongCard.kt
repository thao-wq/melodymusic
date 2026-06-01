package com.example.melodymusic.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SongCard(
    imageRes: Int,
    title: String,
    artist: String
) {

    Card(
        modifier = Modifier
            .width(160.dp)
            .padding(8.dp)
    ) {

        Column {

            Image(
                painter = painterResource(imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = title,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Text(
                text = artist,
                modifier = Modifier.padding(
                    start = 8.dp,
                    bottom = 8.dp
                )
            )
        }
    }
}