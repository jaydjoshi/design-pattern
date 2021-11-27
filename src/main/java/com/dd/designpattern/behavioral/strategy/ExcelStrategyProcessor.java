package com.dd.designpattern.behavioral.strategy;

public class ExcelStrategyProcessor implements FileProcessorStrategy{
    @Override
    public void process() {
        System.out.println("Processing Excel file");
    }
}
