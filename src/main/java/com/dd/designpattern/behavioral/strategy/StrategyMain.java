package com.dd.designpattern.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.setFileProcessorStrategy(new CSVStrategyProcessor());

        fileProcessor.process();

        fileProcessor.setFileProcessorStrategy(new TextFileStrategyProcessor());

        fileProcessor.process();

    }
}
