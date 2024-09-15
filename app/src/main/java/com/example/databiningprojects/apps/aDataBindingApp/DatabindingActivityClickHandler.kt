package com.example.databiningprojects.apps.aDataBindingApp

import android.content.Context
import android.view.View
import android.widget.Toast

class DatabindingActivityClickHandler (var context : Context) {

    fun displayTostMessage(view: View) {
        Toast.makeText(context,"You Clicked the button", Toast.LENGTH_LONG).show()
    }
}