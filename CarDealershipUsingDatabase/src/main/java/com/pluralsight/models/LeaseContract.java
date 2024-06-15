package com.pluralsight.models;

public class LeaseContract extends Contract
{
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String date, String customerName, String customerEmail) {
        super(date, customerName, customerEmail);
    }
}