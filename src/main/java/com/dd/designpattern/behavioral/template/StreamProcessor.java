package com.dd.designpattern.behavioral.template;

public class StreamProcessor extends BatchProcessorTemplate {

    @Override
    public void process() {
        System.out.println("Process called from Stream processor");
    }
}
