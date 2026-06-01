package com.example.melodymusic.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "favorites",

    foreignKeys = [

        ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        ),

        ForeignKey(
            entity = Song::class,
            parentColumns = ["id"],
            childColumns = ["songId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class Favorite(

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,

    val userId:Int,

    val songId:Int
)