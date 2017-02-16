package com.nazar.practice.module03.task032;

import java.util.Scanner;

/**
 * Created by MakeMeSm1Le- on 14.02.2017.
 */
public class Arithmetic {
    public int addFirstAndSecondIntValue(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Scanner inputIntValue = new Scanner(System.in);
        System.out.print("Enter first intValue: -");
        int firstIntValue = inputIntValue.nextInt();
        System.out.print("Enter second intValue: - ");
        int secondIntValue = inputIntValue.nextInt();
        Arithmetic objectArithmetic = new Arithmetic();
        //print sum
        System.out.println("Sum of intNumbers: - " +
                objectArithmetic.addFirstAndSecondIntValue(firstIntValue, secondIntValue));
        // print boolean value
        Adder objectAdder = new Adder();
        System.out.println("boolean value = " + objectAdder.checkStrongestIntValue(firstIntValue, secondIntValue));

    }
}
