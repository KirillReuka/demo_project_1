package com.softserve.task4.service;

import com.softserve.task4.models.Human;

public class HumanService {

    public static void compatibilityTest(Human humanOne, Human humanTwo) {
        humanOne.haveRelationship(humanTwo);
    }
}
