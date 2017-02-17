package com.nazar.practice.module03.task031;

import java.util.Scanner;

public class Bird {
    private static final String BIRDS_SINGER = "I am walking  " +
            "\nI am flying  " +
            "\nI am singing " +
            "\nI am Bird";
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public Bird() {
    }

    public static void main(String[] args) {
        Bird birdVasya = new Bird("Sparrow");
        birdVasya.sing();
        System.out.println();
        Bird someBird = new Bird();
        someBird.sing();
    }

    public void sing() {
        if(name!=null) {
            System.out.println("I  am " + name);
        }
        System.out.println(BIRDS_SINGER);
    }

}
