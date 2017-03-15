package com.nazar.practice.module06.task064;


public class CitizenMain {
    public static void main(String[] args) {
        CitizenFactory object = new CitizenFactory();
        object.returnHuman("Russian").sayHello();
    }
}
