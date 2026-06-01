package com.example.melodymusic.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.melodymusic.data.entity.Song

@Dao
interface SongDao {

    @Insert
    suspend fun insertSong(song: Song)

    @Delete
    suspend fun deleteSong(song: Song)

    @Update
    suspend fun updateSong(song: Song)

    @Query("SELECT * FROM songs")

    fun getAllSongs(): LiveData<List<Song>>
}