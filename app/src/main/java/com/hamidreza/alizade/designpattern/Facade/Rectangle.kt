package com.hamidreza.alizade.designpattern.Facade

import android.util.Log

class Rectangle: Shape {
    override fun draw() {
        Log.e("Rectangle", "Rectangle")
    }
}