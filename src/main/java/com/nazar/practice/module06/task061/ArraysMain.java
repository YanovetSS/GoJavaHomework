package com.nazar.practice.module06.task061;


import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {-1, -32, 3, 4, 5, 6, 7,};

        System.out.println("Initial array:\n" + Arrays.toString(array));
        System.out.println("Reversed initial array:\n" + Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println("Even elements:\n" + Arrays.toString(ArraysUtils.findEvenElements(array)));
        System.out.println("Max element: " + ArraysUtils.MaxValueOfArray(array));
        System.out.println("Min element: " + ArraysUtils.MinValueOfArray(array));
        System.out.println("Sum of all element's: "+ArraysUtils.SumOfArray(array));
        System.out.println("Array Multiplication: "+ArraysUtils.MultiplicationOfArray(array));
        System.out.println("modulus first/last element's: "+ArraysUtils.firsDivisionLastValueModuleOfArray(array));
        System.out.println("Second largest element: " + ArraysUtils.secondLargestValueOfArray(array));
    }
}
