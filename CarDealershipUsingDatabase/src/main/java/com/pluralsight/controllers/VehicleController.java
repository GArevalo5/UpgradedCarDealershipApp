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

    public List<Vehicle> searchByModel(String model){
        return vehicleDao.searchByModel(model);
    }

    public List<Vehicle> searchByColor(String color){
        return vehicleDao.searchByColor(color);
    }

    public List<Vehicle> searchByType(String vehicleType){
        return vehicleDao.searchByType(vehicleType);
    }
}
