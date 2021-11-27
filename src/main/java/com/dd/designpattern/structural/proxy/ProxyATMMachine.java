package com.dd.designpattern.structural.proxy;

public class ProxyATMMachine implements IATMMachine{

    private ATMMachine realATMMachine = new ATMMachine();

    @Override
    public long getCash() {
        preprocess();
        long cash = realATMMachine.getCash();
        System.out.println(cash);
        postProcess();
        return cash;
    }

    private void preprocess() {
        System.out.println("Pre process");
    }

    private void postProcess() {
        System.out.println("Post process");
    }
}
