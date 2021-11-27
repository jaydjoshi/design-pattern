package com.dd.designpattern.behavioral.cor;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {

        Chain<NumberObj> chain1 = new AddChain();
        Chain<NumberObj> chain2 = new SubChain();
        Chain<NumberObj> chain3 = new MultChain();
        Chain<NumberObj> chain4 = new DivChain();

        chain1.nextChain(chain2);
        chain2.nextChain(chain3);
        chain3.nextChain(chain4);

        chain1.calculate(new NumberObj(5,2, "mult"));

    }
}
