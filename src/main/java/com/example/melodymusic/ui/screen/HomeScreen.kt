package com.example.melodymusic.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import com.example.melodymusic.R
import com.example.melodymusic.ui.component.SongCard

data class Album(
    val image: Int,
    val title: String,
    val artist: String
)

@Composable
fun HomeScreen() {

    val albums = listOf(

        Album(
            R.drawable.exitsign,
            "Exit Sign",
            "HIEUTHUHAI"
        ),

        Album(
            R.drawable.crocodile,
            "Nước mắt cá sấu",
            "HIEUTHUHAI"
        ),

        Album(
            R.drawable.hetyeu,
            "Hết Yêu",
            "HIEUTHUHAI"
        )
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Text(
                text = "Melody Music",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Search")
                }
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Recently Played",
                color = Color.White,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(12.dp))

            LazyRow {

                items(albums) { album ->

                    SongCard(
                        imageRes = album.image,
                        title = album.title,
                        artist = album.artist
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Recommended",
                color = Color.White,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(12.dp))

            LazyRow {

                items(albums) { album ->

                    SongCard(
                        imageRes = album.image,
                        title = album.title,
                        artist = album.artist
                    )
                }
            }
        }
    }
}