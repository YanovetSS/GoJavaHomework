package com.nazar.practice.module06.task061;

import java.util.Arrays;

public final class ArraysUtils {
    // не можемо створювати об*єкти в інших класа, тому що приватний конструктор
    private ArraysUtils() {
    }

    public final static int SumOfArray(int[] intArray) {
        int resultSumOfArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            resultSumOfArray += intArray[i];
        }
        return resultSumOfArray;
    }

    public final static int MaxValueOfArray(int[] intArray) {
        int maxValueOfArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (maxValueOfArray < intArray[i]) {
                maxValueOfArray = intArray[i];
            }
        }
        return maxValueOfArray;
    }

    public final static int MinValueOfArray(int[] intArray) {
        int minValueOfArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (minValueOfArray > intArray[i]) {
                minValueOfArray = intArray[i];
            }
        }
        return minValueOfArray;
    }


    public final static int MaxPositiveValueOfArray(int[] intArray) {
        int maxPositiveValueOfArray = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                if (maxPositiveValueOfArray < intArray[i]) {
                    maxPositiveValueOfArray = intArray[i];
                }
            }
        }
        if (maxPositiveValueOfArray < 0) {
            System.out.println("All elements on intArray are less then zero");
        }
            return maxPositiveValueOfArray ;
    }

    public final static int MultiplicationOfArray(int[] intArray) {
        int resultMultiplicationOfArray = 1;
        for (int i = 0; i < intArray.length; i++) {
            resultMultiplicationOfArray *= intArray[i];
        }
        return resultMultiplicationOfArray;
    }

    public final static int firsDivisionLastValueModuleOfArray(int[] intArray) {
        return intArray[0] % intArray[intArray.length - 1];
    }

    public final static int  secondLargestValueOfArray(int[] intArray) {
        int[] sortedArray = Arrays.copyOf(intArray, intArray.length);
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length - 2];
    }

    public final static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            reversedArray[reversedArray.length - 1 - i] = array[i];
        }
        return reversedArray;
    }

    public final static int[] findEvenElements(int[] array) {
        int numberOfEvenElements = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                numberOfEvenElements++;
            }
        }
        int[] arrayOfEvenElements = new int[numberOfEvenElements];
        int arrayIndex = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                arrayOfEvenElements[arrayIndex] = element;
                arrayIndex++;
            }
        }
        return arrayOfEvenElements;
    }
}
