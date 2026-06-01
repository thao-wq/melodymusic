package com.example.melodymusic.data.repository

import com.example.melodymusic.data.dao.*
import com.example.melodymusic.data.entity.*

class MusicRepository(

    private val userDao: UserDao,

    private val songDao: SongDao,

    private val favoriteDao: FavoriteDao

) {

    suspend fun register(
        user: User
    ){
        userDao.register(user)
    }

    suspend fun login(
        email:String,
        password:String
    ) = userDao.login(email,password)

    suspend fun insertSong(
        song: Song
    ){
        songDao.insertSong(song)
    }

    fun getAllSongs() =
        songDao.getAllSongs()
}