package com.pluralsight.views;

import com.pluralsight.models.Vehicle;

public class VehicleColorView extends ViewBase {

    public Vehicle getVehicleColor() {

        System.out.println();
        System.out.println("Search by vehicle color");
        System.out.println("-".repeat(40));

        System.out.print("Enter vehicle model: ");
        String vehicleColor = (scanner.nextLine().strip());

        return new Vehicle();
    }
}
