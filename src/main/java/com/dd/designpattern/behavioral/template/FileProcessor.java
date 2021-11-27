package com.dd.designpattern.behavioral.template;

public class FileProcessor extends BatchProcessorTemplate {

    @Override
    public void process() {
        System.out.println("Process called from File processor");
    }
}
