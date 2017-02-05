package com.nazar.practice.module02.task021;


import java.util.Arrays;

/**
 * Created by MakeMeSm1Le- on 31.01.2017.
 */
public class Arifmetics {
    public static void main(String[] args) {
        int[] intArray = {10, 2, -3, -4, -5, -6, -7, -8, 9, -1};
        Arifmetics Object = new Arifmetics();
        Object.printSumOfArray(intArray);
        Object.printMaxValueOfArray(intArray);
        Object.printMinValueOfArray(intArray);
        Object.printMaxPositiveValueOfArray(intArray);
        Object.printMultiplicationOfArray(intArray);
        Object.firstAndLastValueModulOfArray(intArray);
        Object.secondLargestValueOfArray(intArray);

    }

    public void printSumOfArray(int[] intArray) {
        int resultSumOfArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            resultSumOfArray += intArray[i];
        }
        System.out.println("Sum of Array:" + resultSumOfArray);
    }

    public void printMaxValueOfArray(int[] intArray) {
        int maxValueOfArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (maxValueOfArray < intArray[i]) {
                maxValueOfArray = intArray[i];
            }
        }
        System.out.println("Max value of Array:" + maxValueOfArray);
    }

    public void printMinValueOfArray(int[] intArray) {
        int minValueOfArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (minValueOfArray > intArray[i]) {
                minValueOfArray = intArray[i];
            }
        }
        System.out.println("Min value of Array:" + minValueOfArray);
    }

    public void printMaxPositiveValueOfArray(int[] intArray) {
        int maxPositiveValueOfArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                if (maxPositiveValueOfArray < intArray[i]) {
                    maxPositiveValueOfArray = intArray[i];
                }
            }
        }
        System.out.println("Max positive value of Array:" + maxPositiveValueOfArray);
    }

    public void printMultiplicationOfArray(int[] intArray) {
        int resultMultiplicationOfArray = 1;
        for (int i = 0; i < intArray.length; i++) {
            resultMultiplicationOfArray *= intArray[i];
        }
        System.out.println("Myltiplication  of Array:" + resultMultiplicationOfArray);
    }

    public void firstAndLastValueModulOfArray(int[] intArray) {
        int firstValueOfArray = intArray[0];
        int lastValueOfArray = intArray[intArray.length - 1];
        System.out.println("The first module array elements:" + Math.abs(firstValueOfArray));
        System.out.println("The second module array elements:" + Math.abs(lastValueOfArray));
    }

    public void secondLargestValueOfArray(int[] intArray) {
        Arrays.sort(intArray);
        System.out.println("Second Largest value of Array:" + (intArray.length - 1));
    }
}


