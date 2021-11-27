package com.dd.designpattern.structural.facade;

public class BankFacade {

    public boolean withdraw(int bankAccountNumber, long amount){
        if(Bank.validateAccount(bankAccountNumber) && Bank.hasSufficientBalance(bankAccountNumber, amount)){
            return Bank.withdraw(bankAccountNumber, amount);
        }
        return false;
    }

    public long checkBalance(int bankAccountNumber) {
        return Bank.checkBalance(bankAccountNumber);
    }
}
