package com.example.melodymusic.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SongItem(songName: String) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Row(
            modifier = Modifier.padding(16.dp)
        ) {

            Text("🎵")

            Spacer(
                modifier = Modifier.width(12.dp)
            )

            Text(songName)
        }
    }
}