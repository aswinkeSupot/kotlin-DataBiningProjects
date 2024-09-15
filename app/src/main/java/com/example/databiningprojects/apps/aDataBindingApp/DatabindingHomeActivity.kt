package com.example.databiningprojects.apps.aDataBindingApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databiningprojects.R
import com.example.databiningprojects.databinding.ActivityDatabindingHomeBinding

class DatabindingHomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityDatabindingHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use DataBindingUtil to set the content view with data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_home)

        // Accessing Binding Views.
        binding.tvTitle.text = "DataBinding App"


        //Data binding Variables
        var v1 = Vehicle()
        v1.name = "Mercedes"
        v1.modelYear = "2024"
        binding.myVehicle = v1

        // To link the DatabindingActivityClickHandler with the DatabindingHomeActivity
        binding.clickHandler = DatabindingActivityClickHandler(this)

        // Two-Way Binding
    }

}


/**
 * 1. app level build.gradle.kts  add below code :
 *
 * android {
 *      buildFeatures {
 *         dataBinding = true
 *     }
 * }
 *
 * sync the project.
 *
 * 2. move the xml mainLayout into <layout/> view
 * eg :-
 * <?xml version="1.0" encoding="utf-8"?>
 * <layout
 *     xmlns:android="http://schemas.android.com/apk/res/android"
 *     xmlns:app="http://schemas.android.com/apk/res-auto"
 *     xmlns:tools="http://schemas.android.com/tools">
 *
 *     <androidx.constraintlayout.widget.ConstraintLayout
 *         android:layout_width="match_parent"
 *         android:layout_height="match_parent"
 *         tools:context=".apps.databindingApp.DatabindingHomeActivity">
 *
 *         <TextView
 *             android:layout_width="wrap_content"
 *             android:layout_height="wrap_content"
 *             android:text="DataBindingApp"
 *             android:textSize="32sp"
 *             app:layout_constraintBottom_toBottomOf="parent"
 *             app:layout_constraintEnd_toEndOf="parent"
 *             app:layout_constraintStart_toStartOf="parent"
 *             app:layout_constraintTop_toTopOf="parent" />
 *
 *     </androidx.constraintlayout.widget.ConstraintLayout>
 * </layout>
 *
 * 3. initialize binding in the Activity page
 * eg :-
 * lateinit var binding: ActivityDatabindingHomeBinding
 *
 * 4. replace setContentView to DataBindingUtil.setContentView
 * eg :-
 * binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_home)
 *
 * 5. Access the view from the xml file
 * eg :-
 * binding.tvTitle.text = "Hello Aswin"
 * **/