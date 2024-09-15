package com.example.databiningprojects.apps.cViewModelApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databiningprojects.R
import com.example.databiningprojects.databinding.ActivityViewModelHomeBinding

class ViewModelHomeActivity : AppCompatActivity() {

    lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Data Binding
        var binding = DataBindingUtil.setContentView<ActivityViewModelHomeBinding>(
            this,R.layout.activity_view_model_home)

        // Initialize the ViewModel
        counterViewModel = ViewModelProvider(this)
            .get(CounterViewModel::class.java)

        // Set initial counter value in the TextView
        binding.tvCounter.text = counterViewModel.getCounter().toString()

        binding.btnIncreaseCounter.setOnClickListener {
            counterViewModel.incrementCounter()
            binding.tvCounter.text = counterViewModel.getCounter().toString()
        }

    }
}

/**
 * 1. Add dependency for ViewModel in app level build.gradle.kts
 *  dependencies {
 *      val lifecycle_version = "2.8.4"
 *      implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
 *  }
 * **/