package com.pluralsight.services;

import com.pluralsight.models.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> getAll();

}
