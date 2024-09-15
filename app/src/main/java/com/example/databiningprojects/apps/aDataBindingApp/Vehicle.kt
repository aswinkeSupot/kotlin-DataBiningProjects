package com.example.databiningprojects.apps.aDataBindingApp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databiningprojects.BR

class Vehicle: BaseObservable() {

    var modelYear: String = ""

    /***
     * For implementing @Bindable need to add the below code in app level build.gradle.kts
     * plugins {
     *     id("kotlin-kapt")
     * }
     **/
    @Bindable
    var name: String = ""
        set(value) {
            field = value
//            notifyPropertyChanged(BR.name)
            notifyPropertyChanged(BR.name)
        }
}