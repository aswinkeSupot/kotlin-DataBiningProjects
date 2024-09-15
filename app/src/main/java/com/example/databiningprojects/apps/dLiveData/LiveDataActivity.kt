package com.example.databiningprojects.apps.dLiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databiningprojects.R
import com.example.databiningprojects.databinding.ActivityLiveDataBinding

class LiveDataActivity : AppCompatActivity() {

    lateinit var liveDataModel: LivedataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Data Binding
        var binding = DataBindingUtil.setContentView<ActivityLiveDataBinding>(
            this,R.layout.activity_live_data)

        // Initialize the ViewModel
        // ViewModelProvider: creates and manages instances of ViewModels
        liveDataModel = ViewModelProvider(this)
            .get(LivedataViewModel::class.java)

        // When you deal with LiveData, we should use lifecycleOwner property
        binding.lifecycleOwner = this
        binding.liveDataViewModel = liveDataModel

    }
}

/**
 * 1. Add dependency for ViewModel in app level build.gradle.kts
 * URL - https://developer.android.com/jetpack/androidx/releases/lifecycle#kts
 *  dependencies {
 *      val lifecycle_version = "2.8.4"
 *      implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
 *  }
 *
 *  2. Add dependency for LiveData
 *  implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
 * **/