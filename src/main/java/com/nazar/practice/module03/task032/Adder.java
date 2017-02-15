package com.nazar.practice.module03.task032;

/**
 * Created by MakeMeSm1Le- on 15.02.2017.
 */
public class Adder extends Arithmetic {
    public boolean checkStrongestIntValue(int firstIntValue, int secondIntValue) {
        if (firstIntValue >= secondIntValue) {
            return true;
        } else {
            return false;
        }
    }
}
