package com.marchernandez.screenrecompositiontask

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val charactersPool = ('a'..'z') + ('A'..'Z') + ' '

    fun generateRandomString(): StringBuilder {
        val randomText = StringBuilder()
        val randomTextLength = (25..750).random()
        repeat(randomTextLength) {
            val randomCharactersPoolIndex = charactersPool.indices.random()
            randomText.append(charactersPool[randomCharactersPoolIndex])
        }
        return randomText
    }
}