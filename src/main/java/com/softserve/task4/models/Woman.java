package com.softserve.task4.models;

import java.util.Scanner;

public class Woman extends Human {
    public Woman(String firstName, String lastName, double height, double weight) {
        super(false, firstName, lastName, height, weight);
    }

    Scanner scanner = new Scanner(System.in);

    public Human giveBirthTo(Human man) {
        if (Math.random() <= 0.5) {
            System.out.print("You have a boy. Enter his name - ");
            String childName = scanner.next();
            double childHeight = man.getHeight() + 0.1 * (this.getHeight() - man.getHeight()) ;
            double childWeight = man.getWeight() + 0.1 * (this.getWeight() - man.getWeight()) ;
            return new Man(childName, man.getLastName(), childHeight, childWeight);
        } else {
            System.out.print("You have a girl. Enter her name - ");
            String childName = scanner.next();
            double childHeight = man.getHeight() + 0.1 * (this.getHeight() - man.getHeight()) ;
            double childWeight = man.getWeight() + 0.1 * (this.getWeight() - man.getWeight()) ;
            return new Woman(childName, man.getLastName(), childHeight, childWeight);
        }
    }
}
