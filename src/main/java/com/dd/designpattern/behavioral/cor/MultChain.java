package com.dd.designpattern.behavioral.cor;

public class MultChain implements Chain<NumberObj>{

    private Chain<NumberObj> nextChain;

    @Override
    public void nextChain(Chain<NumberObj> chain) {
        this.nextChain = chain;
    }

    @Override
    public void calculate(NumberObj object) {

        if(object.request() == "mult")
            System.out.println(object.num1() + " * " + object.num2() +" = " +
                (object.num1() * object.num2() ));

        if(nextChain != null){
            nextChain.calculate(object);
        }else{
            System.out.println("Chain ended");
        }
    }
}
