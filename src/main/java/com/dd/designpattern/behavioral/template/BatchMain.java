package com.dd.designpattern.behavioral.template;

public class BatchMain {

    public static void main(String[] args) {

        BatchProcessorTemplate fileProcessor = new FileProcessor();
        fileProcessor.processBatch();
        System.out.println("--------");
        BatchProcessorTemplate dbProcessor = new DBProcessor();
        dbProcessor.processBatch();
        System.out.println("--------");
        BatchProcessorTemplate streamProcessor = new StreamProcessor();
        streamProcessor.processBatch();
        System.out.println("--------");
    }
}
