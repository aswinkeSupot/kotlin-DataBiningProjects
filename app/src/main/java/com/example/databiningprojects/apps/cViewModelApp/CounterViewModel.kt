package com.example.databiningprojects.apps.cViewModelApp

import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    private var counter = 0

    // Getter method for the counter value.
    fun getCounter(): Int{
        return counter
    }

    // Increment the Counter.
    fun incrementCounter(){
        counter++
    }
}