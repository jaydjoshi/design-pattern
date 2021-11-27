package com.dd.designpattern.creational.factory;

import java.util.Optional;

public class PaymentMain {

    public static void main(String[] args) {
        String paymentType = args[0];
        double amount = Double.valueOf(args[1]);

        Optional<Payment> optionalPayment = PaymentFactory.getPayment(paymentType);
        if(optionalPayment.isPresent()){
            optionalPayment.get().pay(amount);
        }else{
            System.out.println("provide a valid payment type");
        }

    }
}
