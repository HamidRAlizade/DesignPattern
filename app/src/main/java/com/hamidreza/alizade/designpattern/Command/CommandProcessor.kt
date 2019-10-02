package com.hamidreza.alizade.designpattern.Command

class CommandProcessor {
    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): CommandProcessor =
        apply {
            queue.add(orderCommand)
        }

    fun processCommands(): CommandProcessor =
        apply {
            queue.forEach { it.execute() }
            queue.clear()
        }

    fun get(indext: Int):CommandProcessor=
        apply {
            queue[indext].execute()
        }

}