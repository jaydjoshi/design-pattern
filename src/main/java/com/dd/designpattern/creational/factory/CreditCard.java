package com.dd.designpattern.creational.factory;

public class CreditCard implements Payment{


    @Override
    public boolean pay(double amount) {
        System.out.println("Payment paid using Credit card");
        return true;
    }
}
