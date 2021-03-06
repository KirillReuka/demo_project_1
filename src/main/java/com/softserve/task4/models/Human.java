package com.softserve.task4.models;

public class Human {
    protected boolean gender;
    protected String firstName;
    protected String lastName;
    protected double height;
    protected double weight;

    public Human(boolean gender, String firstName, String lastName, double height, double weight) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public boolean speak(Human human) {
        if (!this.isGender() && !human.isGender()) {
            return true;
        } else if (!this.isGender() && human.isGender()) {
            return true;
        } else if (this.isGender() && !human.isGender()) {
            return true;
        } else {
            return Math.random() <= 0.5;
        }
    }

    public boolean tolerate(Human human) {
        if (!this.isGender() && !human.isGender()) {
            return Math.random() <= 0.05;
        } else if (!this.isGender() && human.isGender()) {
            return Math.random() <= 0.7;
        } else if (this.isGender() && !human.isGender()) {
            return Math.random() <= 0.7;
        } else {
            return Math.random() <= 0.056;
        }
    }

    public boolean spendTimeTogether(Human human) {
        if ((((human.getHeight() / this.getHeight()) * 100) - 100) <= 10) {
            return Math.random() <= 0.95;
        } else {
            return Math.random() <= 0.85;
        }
    }

    public Human haveRelationship(Human human) {
        if (this instanceof Man && human instanceof Woman) {
            if (this.speak(human) && this.tolerate(human) && this.spendTimeTogether(human)) {
                return (((Woman) human).giveBirthTo(this, human));
            }
        }
        if (this instanceof Woman && human instanceof Man) {
            if (this.speak(human) && this.tolerate(human) && this.spendTimeTogether(human)) {
                return (((Woman) this).giveBirthTo(this, human));
            }
        }
        return null;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "task_at_4.models.Human{" +
                "gender=" + gender +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
