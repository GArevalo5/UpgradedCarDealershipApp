package com.pluralsight.views;

import com.pluralsight.models.Vehicle;
import java.util.List;

public class DisplayAllVehiclesView extends ViewBase {

    public void allVehicles(List<Vehicle> vehicles)
    {
        System.out.println("All vehicles");
        System.out.println("-".repeat(60));

        System.out.printf("%2s %2s %2s %2s,%2s,%2s,%2s,%2s\n", "VIN","Year","Make","Model", "Vehicle Type", "Color", "Odometer","Price");
        System.out.println("-".repeat(70));
        vehicles.forEach(vehicle -> {
            System.out.printf("%2s %2s %2s %s %s,%s,%d,%.2f\n", vehicle.getVin(),vehicle.getYear(),vehicle.getMake()
                    ,vehicle.getModel(),vehicle.getVehicleType(),vehicle.getColor(),
                    vehicle.getOdometer(), vehicle.getPrice());
        });
    }

}
