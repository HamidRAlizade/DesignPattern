package com.hamidreza.alizade.designpattern.Factory

class VehicleFactory {

    lateinit var car:Car
    lateinit var motorCycle: MotorCycle

    fun getVehicleFactory (vehicleType:String): Vehicle? {
        vehicleType.let {
            if (vehicleType.equals("Car")) {
                return Car()
            } else if (vehicleType.equals("MotorCycle")) {
                return MotorCycle()
            }
        }
        return null

    }

}