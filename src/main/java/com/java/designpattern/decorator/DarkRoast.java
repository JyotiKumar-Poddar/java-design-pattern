package com.java.designpattern.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast ";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
