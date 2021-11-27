package com.dd.designpattern.behavioral.strategy;

public class CSVStrategyProcessor implements FileProcessorStrategy{
    @Override
    public void process() {
        System.out.println("Processing CSV file");
    }
}
