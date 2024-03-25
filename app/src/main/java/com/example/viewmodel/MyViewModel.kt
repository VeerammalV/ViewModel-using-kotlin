package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private var counter = 0

    fun getInitialCounter(): Int{
        return counter
    }
    fun geUpdateCounter(): Int{
        return ++counter
    }

}