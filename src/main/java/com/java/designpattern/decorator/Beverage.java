package com.java.designpattern.decorator;

public abstract class Beverage {

    String description = "no description found";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
