package com.nazar.practice.module07.task04;


import java.util.*;

public class Main {
    private static final double CONSTANT_OF_TIME_SHALL_THE_SECOND = 0.001;

    public static void main(String[] args) {
        List<Integer> arrayListInteger = new ArrayList<>();
        List<String> arrayListString = new ArrayList<>();
        List<Integer> linkedListInteger = new LinkedList<>();
        List<String> linkedListString = new LinkedList<>();

        // add  ArrayList<Integer>
        System.out.print("Method .add in ArrayList<Integer> ; ");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayListInteger.add(i);
        }

        long lastTime = System.currentTimeMillis();
        long result = lastTime - startTime;
        System.out.println("result,sec  = " + result * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        // add  ArrayList<String>
        System.out.print("Method .add in ArrayList<String> ; ");
        long startTime11 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayListString.add(String.valueOf(i));
        }

        long lastTime11 = System.currentTimeMillis();
        long result11 = lastTime11 - startTime11;
        System.out.print("result,sec  = " + result11 * CONSTANT_OF_TIME_SHALL_THE_SECOND);
        //----------------------------------------------------------------------------------------------------

        System.out.println();
        // set ArrayList<Integer>
        System.out.print("\nMethod .set in ArrayList<Integer> ; ");
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            arrayListInteger.set(i, i + 1);
        }

        long endTime1 = System.currentTimeMillis();
        long result1 = endTime1 - startTime1;
        System.out.print("result1,sec = " + result1 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        // set ArrayList<String>
        System.out.print("\nMethod .set in ArrayList<String> ; ");
        long startTime12 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            arrayListString.set(i,String.valueOf(i));
        }

        long endTime12 = System.currentTimeMillis();
        long result12 = endTime12 - startTime12;
        System.out.println("result1,sec = " + result12 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        //---------------------------------------------------------------------------------
        System.out.println();

        // get ArrayList<Integer>
        System.out.print("Method .get ArrayList<Integer> ; ");
        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < arrayListInteger.size(); i++) {
            arrayListInteger.get(i);
        }
        long endTime2 = System.currentTimeMillis();
        long result2 = endTime2 - startTime2;
        System.out.println("result2,sec = " + result2 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        // get ArrayList<String>
        System.out.print("Method .get ArrayList<String> ; ");
        long startTime22 = System.currentTimeMillis();

        for (int i = 0; i < arrayListInteger.size(); i++) {
            arrayListString.get(i);
        }
        long endTime22 = System.currentTimeMillis();
        long result22 = endTime22 - startTime22;
        System.out.println("result2,sec = " + result22 * CONSTANT_OF_TIME_SHALL_THE_SECOND);
        //--------------------------------------------------------------------------------------------------------
        System.out.println();

        //remove in ArrayList<Integer>
        System.out.print("Method .remove ArrayList<Integer> ; ");
        long startTime3 = System.currentTimeMillis();

        for (int i = 0; i < arrayListInteger.size(); i++) {
            arrayListInteger.remove(i);
        }
        long endTime3 = System.currentTimeMillis();
        long result3 = endTime3 - startTime3;
        System.out.println("result3,sec = " + result3 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        ////remove in ArrayList<String>
        System.out.print("Method .remove ArrayList<String> ; ");
        long startTime33 = System.currentTimeMillis();

        for (int i = 0; i < arrayListInteger.size(); i++) {
            arrayListString.remove(i);
        }
        long endTime33 = System.currentTimeMillis();
        long result33 = endTime33 - startTime33;
        System.out.print("result3,sec = " + result33 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("----------------------------------------");
        // add  LinkedList<Integer>
        System.out.print("Method .add in LinkedList<Integer> ; ");
        long startTimes1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListInteger.add(i);
        }

        long lastTimes1 = System.currentTimeMillis();
        long results1 = lastTimes1 - startTimes1;
        System.out.println("result,sec  = " + results1 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        // add  LinkedList<String>
        System.out.print("Method .add in LinkedList<String> ; ");
        long startTimes2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListString.add(String.valueOf(i));
        }

        long lastTimes2 = System.currentTimeMillis();
        long results2 = lastTimes2 - startTimes2;
        System.out.print("result,sec  = " + results2 * CONSTANT_OF_TIME_SHALL_THE_SECOND);
        //----------------------------------------------------------------------------------------------------

        System.out.println();
        // set LinkedList<Integer>
        System.out.print("\nMethod .set in LinkedList<Integer> ; ");
        long startTimes3 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedListInteger.set(i, i + 1);
        }

        long endTimes3 = System.currentTimeMillis();
        long results3 = endTimes3 - startTimes3;
        System.out.print("result1,sec = " + results3 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        // set LinkedList<String>
        System.out.print("\nMethod .set in LinkedList<String> ; ");
        long startTimes4 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedListString.set(i,String.valueOf(i));
        }

        long endTimes4 = System.currentTimeMillis();
        long results4 = endTimes4 - startTimes4;
        System.out.println("result1,sec = " + results4 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        //---------------------------------------------------------------------------------
        System.out.println();

        // get LinkedList<Integer>
        System.out.print("Method .get LinkedList<Integer> ; ");
        long startTimes5 = System.currentTimeMillis();

        for (int i = 0; i < linkedListInteger.size(); i++) {
            linkedListInteger.get(i);
        }
        long endTimes5 = System.currentTimeMillis();
        long results5 = endTimes5 - startTimes5;
        System.out.println("result2,sec = " + results5 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        // get LinkedList<String>
        System.out.print("Method .get LinkedList<String> ; ");
        long startTimes6 = System.currentTimeMillis();

        for (int i = 0; i < linkedListString.size(); i++) {
            linkedListString.get(i);
        }
        long endTimes6 = System.currentTimeMillis();
        long results6 = endTimes6 - startTimes6;
        System.out.println("result2,sec = " + results6 * CONSTANT_OF_TIME_SHALL_THE_SECOND);
        //--------------------------------------------------------------------------------------------------------
        System.out.println();

        //remove in LinkedList<Integer>
        System.out.print("Method .remove LinkedList<Integer> ; ");
        long startTimes7 = System.currentTimeMillis();

        for (int i = 0; i < linkedListString.size();i++) {
            linkedListString.remove(i);
        }
        long endTimes7 = System.currentTimeMillis();
        long results7 = endTimes7 - startTimes7;
        System.out.println("result3,sec = " + results7 * CONSTANT_OF_TIME_SHALL_THE_SECOND);

        ////remove in Linked<String>
        System.out.print("Method .remove LinkedList<String> ; ");
        long startTimes8 = System.currentTimeMillis();

        for (int i = 0; i < linkedListString.size(); i++) {
            linkedListString.remove(i);
        }
        long endTimes8 = System.currentTimeMillis();
        long results8 = endTimes8 - startTimes8;
        System.out.print("result3,sec = " + results8 * CONSTANT_OF_TIME_SHALL_THE_SECOND);
    }


}
