package com.nazar.practice.module03.task031;

/**
 * Created by MakeMeSm1Le- on 14.02.2017.
 */
public class Bird {
    private final String name;

    private final String variable;

    public Bird(String name) {
        this.name = name;
        variable = "\nI am " + name +
                "\nI am walking  " +
                "\nI am flying  " +
                "\nI am singing " +
                "\nI am Bird";
    }

    public Bird() {
        name = null;
        variable =
                "\nI am walking  " +
                        "\nI am flying  " +
                        "\nI am singing " +
                        "\nI am Bird";
    }

    public static void main(String[] args) {
        Bird birdShpak = new Bird("Shpak");
        Bird bird = new Bird();

        bird.sing();
        birdShpak.sing();
    }

    public void sing() {
        System.out.println(variable);
    }
}
