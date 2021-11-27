package com.dd.designpattern.behavioral.cor;

public interface Chain<T> {

    public void nextChain(Chain<T> chain);

    public void calculate(T object);

}
