package com.hamidreza.alizade.designpattern.Facade

class ShapeMaker {
    private var circle: Shape? = null
    private var rectangle: Shape? = null

    constructor(){
        circle = Circle()
        rectangle = Rectangle()
    }

    fun drawCircle() {
        circle?.draw()
    }

    fun drawRectangle() {
        rectangle?.draw()
    }
}