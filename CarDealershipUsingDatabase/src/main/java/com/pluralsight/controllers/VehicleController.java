package com.pluralsight.controllers;

import com.pluralsight.models.Vehicle;
import com.pluralsight.services.VehicleDao;

import java.util.List;

public class VehicleController {
    private VehicleDao vehicleDao;

    public VehicleController(VehicleDao vehicleDao)
    {
       this.vehicleDao = vehicleDao;
    }

    public List<Vehicle> findAllVehicles()
    {
       var vehicles = vehicleDao.getAll();

       return vehicles;
    }
}
