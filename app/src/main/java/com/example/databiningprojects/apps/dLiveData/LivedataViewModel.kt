package com.example.databiningprojects.apps.dLiveData

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LivedataViewModel: ViewModel()  {

    /**
     * Create an instance of "MutableLiveData" class
     * MutableLiveData: Subclass of 'LiveData' that holds and manages observable data.
     * **/
    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    // Increment the Counter.
    fun incrementCounter(view: View){
        counter.value = (counter.value)?.plus(1)
    }
}