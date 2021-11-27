package com.dd.designpattern.structural.adapter;

public class SmallSegmentCar implements Car{
    @Override
    public long getPrice() {
        return 100000;
    }
}
