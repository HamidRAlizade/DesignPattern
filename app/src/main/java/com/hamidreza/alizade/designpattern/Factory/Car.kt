package com.hamidreza.alizade.designpattern.Factory

import android.util.Log

class Car :Vehicle {
    override fun showVehicleType() {
        Log.e("Car", "Car")

    }
}