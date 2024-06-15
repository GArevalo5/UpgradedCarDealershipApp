package com.pluralsight.models;

public abstract class Contract
{
    private String date;
    private String customerName;
    private String customerEmail;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String customerName, String customerEmail)
    {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

}