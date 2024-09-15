package com.example.databiningprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.databiningprojects.apps.aDataBindingApp.DatabindingHomeActivity
import com.example.databiningprojects.apps.dLiveData.LiveDataActivity
import com.example.databiningprojects.apps.bQuadraticEqtnSolver.QuadraticEquationActivity
import com.example.databiningprojects.apps.cViewModelApp.ViewModelHomeActivity

class MainActivity : AppCompatActivity() {
    lateinit var BtnDataBindingApp : Button
    lateinit var btnQuadraticApp : Button
    lateinit var btnViewModelApp : Button
    lateinit var btnLiveDataApp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnDataBindingApp = findViewById(R.id.BtnDataBindingApp)
        btnQuadraticApp = findViewById(R.id.btnQuadraticApp)
        btnViewModelApp = findViewById(R.id.btnViewModelApp)
        btnLiveDataApp = findViewById(R.id.btnLiveDataApp)

        BtnDataBindingApp.setOnClickListener {
            val intent = Intent(this, DatabindingHomeActivity::class.java)
            startActivity(intent)
        }

        btnQuadraticApp.setOnClickListener {
            val intent = Intent(this, QuadraticEquationActivity::class.java)
            startActivity(intent)
        }

        btnViewModelApp.setOnClickListener {
            val intent = Intent(this, ViewModelHomeActivity::class.java)
            startActivity(intent)
        }

        btnLiveDataApp.setOnClickListener {
            val intent = Intent(this, LiveDataActivity::class.java)
            startActivity(intent)
        }
    }
}