package com.daddyjoys.java.patterns.factory;

public class Almond implements Factory {
    @Override
    public void eat() {
        System.out.println("Almond");
    }
}
