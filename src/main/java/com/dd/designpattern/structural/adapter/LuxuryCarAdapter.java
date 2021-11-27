package com.dd.designpattern.structural.adapter;

public class LuxuryCarAdapter {

    private LuxuryCar luxuryCar;

    public LuxuryCarAdapter(LuxuryCar luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    long getPrice(){
        return convertUSDToINR(luxuryCar.getPrice());
    }

    private long convertUSDToINR(long price) {
        return 75*price;
    }
}
