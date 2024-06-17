package com.pluralsight.views;

import com.pluralsight.models.Vehicle;

public class VehicleTypeView extends ViewBase {
    public Vehicle getVehicleType()
    {
        System.out.println();
        System.out.println("Search by vehicle type");
        System.out.println("-".repeat(40));

        System.out.print("Enter vehicle type: ");
        String vehicleType = scanner.nextLine().strip().trim();

        return new Vehicle();
    }
}
