package com.java.designpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description ="HouseBlend ";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
