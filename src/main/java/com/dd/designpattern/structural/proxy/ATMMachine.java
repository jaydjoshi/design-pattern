package com.dd.designpattern.structural.proxy;

public class ATMMachine implements IATMMachine{
    private int cash;
    public long getCash(){
        return cash;
    }
}
