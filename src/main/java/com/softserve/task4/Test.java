package com.softserve.task4;

import com.softserve.task4.models.Man;
import com.softserve.task4.models.Woman;
import com.softserve.task4.service.HumanService;

public class Test {
    public static void main(String[] args) {
        Man man = new Man(true, "Oleg", "Ivanov", 180, 80);
        Woman woman = new Woman(false, "Elena", "Ivanova", 1, 55);

        HumanService.compatibilityTest(man, woman);
    }
}
