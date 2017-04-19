package com.nazar.practice.module10.task01.task01;


public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Test exception ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally in action!");
        }
    }
}
