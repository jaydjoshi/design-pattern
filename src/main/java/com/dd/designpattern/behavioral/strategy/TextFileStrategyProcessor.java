package com.dd.designpattern.behavioral.strategy;

public class TextFileStrategyProcessor implements FileProcessorStrategy{
    @Override
    public void process() {
        System.out.println("Processing text file");
    }
}
