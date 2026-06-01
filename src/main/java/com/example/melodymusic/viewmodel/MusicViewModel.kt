package com.example.melodymusic.viewmodel

import androidx.lifecycle.*
import kotlinx.coroutines.launch

import com.example.melodymusic.data.entity.*
import com.example.melodymusic.data.repository.*

class MusicViewModel(

    private val repository:
    MusicRepository

): ViewModel(){

    fun register(user: User){

        viewModelScope.launch {

            repository.register(user)
        }
    }

    fun insertSong(song: Song){

        viewModelScope.launch {

            repository.insertSong(song)
        }
    }

    fun getSongs() =
        repository.getAllSongs()
}