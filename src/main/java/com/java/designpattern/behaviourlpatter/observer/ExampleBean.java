package com.java.designpattern.behaviourlpatter.observer;

import java.beans.ConstructorProperties;

public class ExampleBean {

    private final String ultimateAnswer;
    private final int years;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }


}
