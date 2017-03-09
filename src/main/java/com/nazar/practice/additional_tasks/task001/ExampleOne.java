package com.nazar.practice.additional_tasks.task001;

import java.util.Scanner;

/**
 * Created by MakeMeSm1Le- on 16.02.2017.
 */
public class ExampleOne {
    public static void main(String[] args) {
        System.out.print("Enter x: - ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("Enter y: - ");
        int y = input.nextInt();
        intArray(x,y);
    }
    private static void intArray(int x , int y){
        int counter = 0;
        int[][] myArray = new int[x][y];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
    private static void printArray(){

    }
}
