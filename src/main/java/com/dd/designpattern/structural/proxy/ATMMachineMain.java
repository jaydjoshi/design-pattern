package com.dd.designpattern.structural.proxy;

public class ATMMachineMain {
    public static void main(String[] args) {
        ProxyATMMachine proxyATMMachine = new ProxyATMMachine();

        proxyATMMachine.getCash();
    }
}
