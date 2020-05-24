package com.daddyjoys.java.patterns.factory;

public class Chocolate implements  Factory {
    @Override
    public void eat() {
        System.out.println("Chocolate");
    }
}
