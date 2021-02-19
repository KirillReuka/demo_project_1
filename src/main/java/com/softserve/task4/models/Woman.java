package com.softserve.task4.models;

public class Woman extends Human {
    public Woman(String firstName, String lastName, float height, float weight) {
        super(false, firstName, lastName, height, weight);
    }

    public Human giveBirthTo(Human man) {

        return null;
    }
}
