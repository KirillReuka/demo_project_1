package com.softserve.task4;

import com.softserve.task4.models.Man;
import com.softserve.task4.models.Woman;

public class Test {
    public static void main(String[] args) {
        Man man = new Man("Oleg", "Ivanov", 180, 80);
        Woman woman = new Woman("Elena", "Ivanova", 165, 55);
//        System.out.println(woman.isGender());
//        System.out.println("W-W - true");
//        System.out.println(woman.speak(woman));
//        System.out.println("W-M - true");
//        System.out.println(woman.speak(man));
//        System.out.println("M-W - true");
//        System.out.println(man.speak(woman));
//        System.out.println("M-M - 0.5");
//        System.out.println(man.speak(man));
        System.out.println("W-W - true, false");
        System.out.println(woman.tolerate(woman));
        System.out.println("W-M - true, false");
        System.out.println(woman.tolerate(man));
        System.out.println("M-W - true, false");
        System.out.println(man.tolerate(woman));
        System.out.println("M-M - 0.056 true, false");
        System.out.println(man.tolerate(man));
        System.out.println("\n");
        System.out.println("W-W - true, false");
        System.out.println(woman.tolerate(woman));
        System.out.println("W-M - true, false");
        System.out.println(woman.tolerate(man));
        System.out.println("M-W - true, false");
        System.out.println(man.tolerate(woman));
        System.out.println("M-M - 0.056 true, false");
        System.out.println(man.tolerate(man));
        System.out.println("\n");
        System.out.println("W-W - true, false");
        System.out.println(woman.tolerate(woman));
        System.out.println("W-M - true, false");
        System.out.println(woman.tolerate(man));
        System.out.println("M-W - true, false");
        System.out.println(man.tolerate(woman));
        System.out.println("M-M - 0.056 true, false");
        System.out.println(man.tolerate(man));
        System.out.println("\n");
        System.out.println("W-W - true, false");
        System.out.println(woman.tolerate(woman));
        System.out.println("W-M - true, false");
        System.out.println(woman.tolerate(man));
        System.out.println("M-W - true, false");
        System.out.println(man.tolerate(woman));
        System.out.println("M-M - 0.056 true, false");
        System.out.println(man.tolerate(man));
        System.out.println("\n");
        System.out.println("W-W - true, false");
        System.out.println(woman.tolerate(woman));
        System.out.println("W-M - true, false");
        System.out.println(woman.tolerate(man));
        System.out.println("M-W - true, false");
        System.out.println(man.tolerate(woman));
        System.out.println("M-M - 0.056 true, false");
        System.out.println(man.tolerate(man));
        System.out.println("\n");
    }
}
