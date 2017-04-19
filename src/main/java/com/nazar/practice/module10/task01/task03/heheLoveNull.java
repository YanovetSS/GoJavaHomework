package com.nazar.practice.module10.task01.task03;

public class heheLoveNull {
    public static void main(String[] args) {
        heheLoveNull heheLoveNull = null;

        try{
            heheLoveNull.printMethod();
        }catch (NullPointerException q){
            System.out.println("Exception : - "+q);
        }
    }

    public  void printMethod(){
        System.out.println("Run...");
    }
}
