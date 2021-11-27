package com.dd.designpattern.behavioral.template;

public abstract class BatchProcessorTemplate {

    public void processBatch(){
        preProcess();
        process();
        postProcess();
    }

    public void preProcess(){
        System.out.println("Pre process");
    }

    public abstract void process();

    public void postProcess(){
        System.out.println("Post process");
    }
}
