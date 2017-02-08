package com.nazar.practice.module02.task021;


import java.util.Arrays;

/**
 * Created by MakeMeSm1Le- on 31.01.2017.
 */
public class Arifmetics {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, -8, 9, 10};
        double[] doubleArray = {101.24d, 202.50d, 10.29d, -28.55d, -66.98d};
        Arifmetics object = new Arifmetics();
        object.printSumOfArray(intArray);//sum
        object.printSumOfArray(doubleArray);//sum
        object.printMaxValueOfArray(intArray);//maxValue
        object.printMaxValueOfArray(doubleArray);//maxValue
        object.printMinValueOfArray(intArray);//minValue
        object.printMinValueOfArray(doubleArray);//minValue
        object.printMaxPositiveValueOfArray(intArray);//maxPositive
        object.printMaxPositiveValueOfArray(doubleArray);//maxPositive
        object.printMultiplicationOfArray(intArray);//multiplication
        object.printMultiplicationOfArray(doubleArray);//multiplication
        object.firstAndLastValueModuleOfArray(intArray);//module
        object.firstAndLastValueModuleOfArray(doubleArray);//module
        object.secondLargestValueOfArray(intArray);//secondLargest
        object.secondLargestValueOfArray(doubleArray);//secondLargest
    }

    // Sum
    public void printSumOfArray(int[] intArray) {
        int resultSumOfArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            resultSumOfArray += intArray[i];
        }
        System.out.println("Sum of intArray:" + resultSumOfArray);
    }

    public void printSumOfArray(double[] doubleArray) {
        double resultSumOfArray = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            resultSumOfArray += doubleArray[i];
        }
        System.out.println("Sum of doubleArray:" + resultSumOfArray);
    }

    //MaxValue
    public void printMaxValueOfArray(int[] intArray) {
        int maxValueOfArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (maxValueOfArray < intArray[i]) {
                maxValueOfArray = intArray[i];
            }
        }
        System.out.println("Max value of intArray:" + maxValueOfArray);
    }

    public void printMaxValueOfArray(double[] doubleArray) {
        double maxValueOfArray = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (maxValueOfArray < doubleArray[i]) {
                maxValueOfArray = doubleArray[i];
            }
        }
        System.out.println("Max value of doubleArray:" + maxValueOfArray);
    }

    //MinValue
    public void printMinValueOfArray(int[] intArray) {
        int minValueOfArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (minValueOfArray > intArray[i]) {
                minValueOfArray = intArray[i];
            }
        }
        System.out.println("Min value of intArray:" + minValueOfArray);
    }

    public void printMinValueOfArray(double[] doubleArray) {
        double minValueOfArray = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (minValueOfArray > doubleArray[i]) {
                minValueOfArray = doubleArray[i];
            }
        }
        System.out.println("Min value of doubleArray:" + minValueOfArray);
    }

    public void printMaxPositiveValueOfArray(int[] intArray){
        int maxPositiveValueOfArray = intArray[0];
        for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i]>0){
                if(maxPositiveValueOfArray < intArray[i]){
                    maxPositiveValueOfArray = intArray[i];
                }
            }
        }
        if(maxPositiveValueOfArray< 0 ){
            System.out.println("All elements on intArray are less then zero");
        }
        else {
            System.out.println("Max positive value of intArray: " + maxPositiveValueOfArray);
        }
    }

    public void printMaxPositiveValueOfArray(double[] doubleArray) {
        double maxPositiveValueOfArray = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > 0) {
                if (maxPositiveValueOfArray < doubleArray[i]) {
                    maxPositiveValueOfArray = doubleArray[i];
                }
            }
        }
        if(maxPositiveValueOfArray < 0 ){
            System.out.println("All elements on doubleArray are less then zero");
        }
        else {
            System.out.println("Max positive value of doubleArray:" + maxPositiveValueOfArray);
        }
    }

    //multiplication
    public void printMultiplicationOfArray(int[] intArray) {
        int resultMultiplicationOfArray = 1;
        for (int i = 0; i < intArray.length; i++) {
            resultMultiplicationOfArray *= intArray[i];
        }
        System.out.println("Multiplication  of intArray:" + resultMultiplicationOfArray);
    }

    public void printMultiplicationOfArray(double[] doubleArray) {
        int resultMultiplicationOfArray = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            resultMultiplicationOfArray *= doubleArray[i];
        }
        System.out.println("Multiplication  of doubleArray:" + resultMultiplicationOfArray);
    }

    //module
    public void firstAndLastValueModuleOfArray(int[] intArray) {
        int firstValueOfArray = intArray[0];
        int lastValueOfArray = intArray[intArray.length - 1];
        System.out.println("The first module of intArray elements:" + Math.abs(firstValueOfArray));
        System.out.println("The second module of intArray elements:" + Math.abs(lastValueOfArray));
    }

    public void firstAndLastValueModuleOfArray(double[] doubleArray) {
        double firstValueOfArray = doubleArray[0];
        double lastValueOfArray = doubleArray[doubleArray.length - 1];
        System.out.println("The first module of doubleArray elements:" + Math.abs(firstValueOfArray));
        System.out.println("The second module of doubleArray elements:" + Math.abs(lastValueOfArray));
    }

    //secondLargest
    public void secondLargestValueOfArray(int[] intArray) {
        Arrays.sort(intArray);
        System.out.println("Second Largest value of intArray:" + (intArray[8]));
    }

    public void secondLargestValueOfArray(double[] doubleArray) {
        Arrays.sort(doubleArray);
        System.out.println("Second Largest value of doubleArray:" + (doubleArray[3]));
    }
}


