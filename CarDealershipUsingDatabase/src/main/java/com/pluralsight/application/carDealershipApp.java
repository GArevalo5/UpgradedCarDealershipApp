package com.pluralsight.application;

import com.pluralsight.models.Vehicle;
import java.util.List;

public class carDealershipApp {

    private final ApplicationConfiguration config;

    public carDealershipApp(ApplicationConfiguration config){
        this.config = config;
    }

    public void run(){

        while (true){
            int userSelection = config.homeview.userSelection();

            switch (userSelection)
            {
                case 0 -> buyOrLeaseReq();
                case 1 -> findPriceRange();
                case 2 -> findMakeModel();
                case 3 -> findYearRange();
                case 4 -> findVehicleColor();
                case 5 -> findMileRange();
                case 6 -> findVehicleType();
                case 7 -> findAllVehicle();
                case 8 -> addVehicle();
                case 9 -> removeVehicle();
                case 99 -> System.exit(0);

            }
        }

    }
    public void buyOrLeaseReq()
    {
        System.out.println("work in progress");
    }

    public void findAllVehicle()
    {
        List<Vehicle> vehicles = config.vehicleController.findAllVehicles();
        config.displayAllVehiclesView.allVehicles(vehicles);
    }

    private void displayVehicle(){
        List<Vehicle> vehicles = config.vehicleController.findAllVehicles();
        config.displayAllVehiclesView.allVehicles(vehicles);
    }

    public void removeVehicle()
    {
        System.out.println("work in progress");
    }

    public void addVehicle()
    {
        System.out.println("work in progress");
    }

    public void findVehicleType(){
        Vehicle searchType = config.vehicleTypeView.getVehicleType();

        List<Vehicle> vehicles = config.vehicleController.searchByType(searchType.getVehicleType());
    }

    public void findMileRange()
    {
        System.out.println("work in progress");
    }

    public void findVehicleColor(){
        Vehicle searchColor = config.vehicleColorView.getVehicleColor();

        List<Vehicle> vehicles = config.vehicleController.searchByColor(searchColor.getColor());
    }

    public void findYearRange()
    {
        System.out.println("work in progress");
    }

    public void findMakeModel(){
        Vehicle searchModel = config.vehicleModelView.getVehicleModel();

        List<Vehicle> vehicles = config.vehicleController.searchByModel(searchModel.getModel());

    }

    public void findPriceRange()
    {
        System.out.println("work in progress");
    }

    private void updateContract()
    {
        System.out.println("work in progress");
    }

    private void updateDealership()
    {
        System.out.println("work in progress");
    }
}
