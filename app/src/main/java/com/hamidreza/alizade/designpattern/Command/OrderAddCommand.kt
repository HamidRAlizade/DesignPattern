package com.hamidreza.alizade.designpattern.Command

import android.util.Log

class OrderAddCommand (val id: Long) : OrderCommand {
    override fun execute() {
       Log.e("OrderAddCommand" ,"OrderAddCommand")
    }
}