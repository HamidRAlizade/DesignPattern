package com.hamidreza.alizade.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hamidreza.alizade.designpattern.Adapter.CelsiusTemperature
import com.hamidreza.alizade.designpattern.Adapter.FahrenheitTemperature
import com.hamidreza.alizade.designpattern.Command.CommandProcessor
import com.hamidreza.alizade.designpattern.Command.OrderAddCommand
import com.hamidreza.alizade.designpattern.Command.OrderPayCommand
import com.hamidreza.alizade.designpattern.Facade.ShapeMaker
import com.hamidreza.alizade.designpattern.Factory.Vehicle
import com.hamidreza.alizade.designpattern.Factory.VehicleFactory




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shapeMaker = ShapeMaker()

        shapeMaker.drawCircle()
        shapeMaker.drawRectangle()


        var commandProcessor=CommandProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(2L))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))

          commandProcessor.get(1)




        val celsiusTemperature = CelsiusTemperature(0.0)
        val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)

        celsiusTemperature.temperature = 36.6
        Log.e("Adapter","${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature} F")


        fahrenheitTemperature.temperature = 100.0
        Log.e("Adapter","${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature} C")

    var vehicleFactory=VehicleFactory()

        val motorCycle :Vehicle= vehicleFactory.getVehicleFactory("MotorCycle")!!
        motorCycle.showVehicleType()
    }
}
