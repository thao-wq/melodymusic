package com.example.melodymusic.data.dao

import androidx.room.*

import com.example.melodymusic.data.entity.Favorite

@Dao
interface FavoriteDao {

    @Insert
    suspend fun addFavorite(
        favorite: Favorite
    )

    @Delete
    suspend fun removeFavorite(
        favorite: Favorite
    )

    @Query(
        "SELECT * FROM favorites " +
                "WHERE userId = :userId"
    )

    suspend fun getFavorites(
        userId:Int
    ): List<Favorite>
}