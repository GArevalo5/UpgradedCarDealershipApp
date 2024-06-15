package com.pluralsight.views;

import java.util.Scanner;

public class Homeview {
    Scanner userInput = new Scanner(System.in);

    public int userSelection()
    {
        System.out.println();
        System.out.println("Car Dealership home screen");
        System.out.println("-".repeat(50));
        System.out.println("0) Buy/lease a vehicle");
        System.out.println("1) Find vehicles within a price range");
        System.out.println("2) Find vehicles by make / model");
        System.out.println("3) Find vehicles by year range");
        System.out.println("4) Find vehicles by color");
        System.out.println("5) Find vehicles by mileage range");
        System.out.println("6) Find vehicles by type");
        System.out.println("7) List all vehicles");
        System.out.println("8) add a vehicle");
        System.out.println("9) remove a vehicle");
        System.out.println("99) quit");
        System.out.println();
        System.out.print("Enter your option here: ");

        return Integer.parseInt(userInput.nextLine());
    }
}
