package com.dd.designpattern.structural.adapter;

public class CarMain {
    public static void main(String[] args) {

        SmallSegmentCar maruti = new SmallSegmentCar();
        MidSegmentCar hyndai = new MidSegmentCar();
        LuxuryCar bmw = new LuxuryCar();

        LuxuryCarAdapter bmwAdapter = new LuxuryCarAdapter(bmw);

        System.out.println("Prices");

        System.out.println("Maruti Car: "+maruti.getPrice());
        System.out.println("Hyundai Car: "+hyndai.getPrice());
        System.out.println("BMW Car (USD): "+ bmw.getPrice());
        System.out.println("BMW Car (INR): "+ bmwAdapter.getPrice());

    }
}
