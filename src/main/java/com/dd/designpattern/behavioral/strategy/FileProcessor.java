package com.dd.designpattern.behavioral.strategy;

import com.dd.designpattern.behavioral.template.BatchProcessorTemplate;

/**
 * Extension from template design pattern
 */
public class FileProcessor extends BatchProcessorTemplate {

    FileProcessorStrategy fileProcessorStrategy;

    public void setFileProcessorStrategy(FileProcessorStrategy fileProcessorStrategy) {
        this.fileProcessorStrategy = fileProcessorStrategy;
    }

    @Override
    public void process() {
        fileProcessorStrategy.process();
    }
}
