package com.dd.designpattern.creational.factory;

import java.util.Optional;

public class PaymentFactory {

    public static final String CREDIT_CARD= "CREDIT_CARD";
    public static final String PAYPAL= "PAYPAL";

    public static Optional<Payment> getPayment(String paymentType){
        Payment payment = null;
        switch (paymentType){
            case CREDIT_CARD:
                payment = new CreditCard();
                break;
            case PAYPAL:
                payment = new Paypal();
                break;
            default:
                System.out.println("error");

        }
        return Optional.of(payment);
    }

}
