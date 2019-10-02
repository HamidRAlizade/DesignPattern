package com.hamidreza.alizade.designpattern.Singleton

import android.util.Log

class EagerInitializedSingleton {
    private var instance: EagerInitializedSingleton? = null

    fun getInstance(): EagerInitializedSingleton {
        if (instance == null) {
            instance = EagerInitializedSingleton()
            Log.e("kmkm", "lhjkljl")
        }

        return instance as EagerInitializedSingleton
    }
}


