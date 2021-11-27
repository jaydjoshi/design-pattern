package com.dd.designpattern.behavioral.template;

public class DBProcessor extends BatchProcessorTemplate {

    @Override
    public void process() {
        System.out.println("Process called from DB processor");
    }
}
