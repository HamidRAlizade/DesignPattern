package com.hamidreza.alizade.designpattern.Command

import android.util.Log

class OrderPayCommand(val id: Long) : OrderCommand {
    override fun execute() {
        Log.e("OrderPayCommand" ,"OrderPayCommand")

}
}