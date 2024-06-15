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
                case 1 -> buyOrLeaseReq();
                case 2 -> findPriceRange();
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
