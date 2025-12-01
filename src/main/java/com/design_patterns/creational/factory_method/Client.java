package com.design_patterns.creational.factory_method;

public class Client {

    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

}
