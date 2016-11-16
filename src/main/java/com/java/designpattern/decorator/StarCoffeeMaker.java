package com.java.designpattern.decorator;

import java.io.*;

abstract class Employee {
    String designation = "jyoti";

    public abstract String getDesignation();
}

class Bos extends Employee {

    Bos employee=null;

    @Override
    public String getDesignation() {
        return "\n" + employee.designation;
    }

    public Bos(String designation) {
        super.designation = designation;
    }

    public Bos(String designation, Bos bos) {

        employee = bos;
        employee.designation = designation+"  "+bos.designation;
    }
}


public class StarCoffeeMaker {


    public static void main(String[] args) throws IOException {


        Beverage beverage1 = new Espresso();

        beverage1 = new Mocha(beverage1);


        beverage1 = new Mocha(beverage1);
        // objects have reference of previous reference
        // similar to creating a list of objects

        System.out.printf("The description is {%s} and the price is {%f}", beverage1.getDescription(), beverage1.getCost());


        Bos bos = new Bos("===BOSS====");
        Employee employeeHead = new Bos("MD",bos);

        employeeHead = new Bos("CEO",bos);
        employeeHead = new Bos("CTO",bos);
        System.out.println(employeeHead.getDesignation());

        FileInputStream fis = new FileInputStream("/objects.gz");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

    }

}
