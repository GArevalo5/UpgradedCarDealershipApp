package com.pluralsight.services;

import com.pluralsight.models.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> getAll();
    List<Vehicle> searchByModel(String model);
    List<Vehicle> searchByColor(String color);
    List<Vehicle> searchByType(String vehicleType);
    Void addVehicle(Vehicle vehicle);
    Void removeVehicle(String vin);




}
