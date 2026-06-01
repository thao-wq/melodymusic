package com.example.melodymusic.data.database

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.melodymusic.data.dao.*
import com.example.melodymusic.data.entity.*

@Database(
    entities = [
        User::class,
        Song::class,
        Favorite::class
    ],

    version = 1,

    exportSchema = false
)

abstract class MusicDatabase
    : RoomDatabase(){

    abstract fun userDao(): UserDao

    abstract fun songDao(): SongDao

    abstract fun favoriteDao(): FavoriteDao

    companion object{

        @Volatile
        private var INSTANCE:
                MusicDatabase? = null

        fun getDatabase(
            context: Context
        ): MusicDatabase {

            return INSTANCE
                ?: synchronized(this){

                    val instance =
                        Room.databaseBuilder(
                            context.applicationContext,

                            MusicDatabase::class.java,

                            "music_database"
                        ).build()

                    INSTANCE = instance

                    instance
                }
        }
    }
}