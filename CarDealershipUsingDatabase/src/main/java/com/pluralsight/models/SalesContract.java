package com.pluralsight.models;

public class SalesContract extends Contract
{
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean finance;


    public SalesContract(String date, String customerName, String customerEmail) {
        super(date, customerName, customerEmail);
    }
}