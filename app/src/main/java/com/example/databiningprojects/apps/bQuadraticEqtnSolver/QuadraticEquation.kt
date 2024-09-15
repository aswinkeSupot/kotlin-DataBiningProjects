package com.example.databiningprojects.apps.bQuadraticEqtnSolver

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databiningprojects.BR
import com.example.databiningprojects.databinding.ActivityQuadraticEquationBinding
import kotlin.math.sqrt

/***
 * NOTE-
 * For implementing @Bindable need to add "kotlin-kapt" plugin in app level build.gradle.kts
 * plugins {
 *     id("kotlin-kapt")
 * }
 **/

class QuadraticEquation(val binding: ActivityQuadraticEquationBinding) : BaseObservable() {
    @Bindable
    var a: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }

    @Bindable
    var b: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @Bindable
    var c: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.c)
        }

    fun solveEquation(view: View){
        var a = a.toInt()
        var b = b.toInt()
        var c = c.toInt()

        // Calculating the Discriminant
        var discriminant = ((b*b) - (4*a*c))

        // Finding the Solutions (Roots)
        var x1 : Double
        var x2 : Double
        if (discriminant > 0){
             // Two Real and Distinct Roots
            x1 = (-b + sqrt(discriminant.toDouble())) / (2*a)
            x2 = (-b - sqrt(discriminant.toDouble())) / (2*a)

            // Display the results in the textView
            binding.tvResult.text = "X1 = $x1 , X2 = $x2"
        }else if (discriminant < 0){
            // No real roots.
            binding.tvResult.text = "No Real Roots (Complex Roots)"
        }else{
            // discriminant == 0
            // One Real Solution (Double root)
            x1 = (-b / (2*a)).toDouble()
            binding.tvResult.text = "x = $x1"
        }
    }
}