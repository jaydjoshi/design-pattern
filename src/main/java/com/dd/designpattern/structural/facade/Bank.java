package com.dd.designpattern.structural.facade;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Bank {
    private static Map<Integer, Long> bankAccountBalances = new ConcurrentHashMap<>();

    static {
        bankAccountBalances.put(1001,100l);
        bankAccountBalances.put(1002,200l);
    }

    public static boolean validateAccount(int accountNumber){
        if(bankAccountBalances.containsKey(accountNumber)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean hasSufficientBalance(int bankAccountNumber, long amount) {
        long bankBalance = bankAccountBalances.get(bankAccountNumber);
        if(amount <= bankBalance){
            return true;
        }else{
            return false;
        }
    }

    public static boolean withdraw(int bankAccountNumber, long amount) {
        try {
            long currentBalance = bankAccountBalances.get(bankAccountNumber);
            AtomicLong balanceAfterWithdrawal = new AtomicLong(currentBalance);
            balanceAfterWithdrawal.getAndAdd(-1 * amount);

            bankAccountBalances.put(bankAccountNumber, balanceAfterWithdrawal.get());
            return true;
        }catch(Exception e){
            System.out.println("error");
            return false;
        }
    }

    public static long checkBalance(int bankAccountNumber) {
        return bankAccountBalances.get(bankAccountNumber);
    }
}
