package com.dd.designpattern.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonMain{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s == s1);
    }
}
