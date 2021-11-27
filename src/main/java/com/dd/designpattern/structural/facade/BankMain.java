package com.dd.designpattern.structural.facade;

public class BankMain {
    public static void main(String[] args) {
        BankFacade abcBankFacade = new BankFacade();

        System.out.println("Bank balance for Acc 1");
        System.out.println(abcBankFacade.checkBalance(1001));
        abcBankFacade.withdraw(1001,50);
        System.out.println(abcBankFacade.checkBalance(1001));
        abcBankFacade.withdraw(1001,50);
        System.out.println(abcBankFacade.checkBalance(1001));

        System.out.println("Bank balance for Acc 2");
        System.out.println(abcBankFacade.checkBalance(1002));
        abcBankFacade.withdraw(1002,250);
        System.out.println(abcBankFacade.checkBalance(1002));
        abcBankFacade.withdraw(1002,190);
        System.out.println(abcBankFacade.checkBalance(1002));
    }
}
