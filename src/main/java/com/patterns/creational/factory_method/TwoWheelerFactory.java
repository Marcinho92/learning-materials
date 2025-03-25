package com.patterns.creational.factory_method;

public class TwoWheelerFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
