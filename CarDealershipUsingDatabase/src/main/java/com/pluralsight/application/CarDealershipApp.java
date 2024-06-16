package com.pluralsight.application;

import java.io.ObjectInputFilter;
import java.util.Scanner;

public class CarDealershipApp {

    private final ApplicationConfiguration config;
    public CarDealershipApp(ApplicationConfiguration config){
        this.config = config;
    }
    Scanner userInput = new Scanner(System.in);

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
    public void buyOrLeaseReq(){

    }

    public void findAllVehicle(){

    }

    private void displayVehicle(){

    }

    public void removeVehicle(){

    }

    public void addVehicle(){

    }

    public void findVehicleType(){

    }

    public void findMileRange(){

    }

    public void findVehicleColor(){

    }

    public void findYearRange(){

    }

    public void findMakeModel(){

    }

    public void findPriceRange(){

    }

    private void updateContract(){

    }

    private void updateDealership(){

    }
}
