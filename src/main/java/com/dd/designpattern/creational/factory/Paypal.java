package com.dd.designpattern.creational.factory;

public class Paypal implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid using Paypal");
        return true;
    }
}
