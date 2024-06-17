package com.pluralsight.views;

import com.pluralsight.models.Vehicle;

public class VehicleModelView extends ViewBase {
    public Vehicle getVehicleModel() {

        System.out.println();
        System.out.println("Search by vehicle model");
        System.out.println("-".repeat(40));

        System.out.print("Enter vehicle model: ");
        String vehicleModel = (scanner.nextLine().strip());

        return new Vehicle();
    }
}
