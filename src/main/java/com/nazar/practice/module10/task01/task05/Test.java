package com.nazar.practice.module10.task01.task05;

import com.nazar.practice.module10.task01.task02.MyException;
import com.nazar.practice.module10.task01.task04.MySecondException;

public class Test {
    public static void main(String[] args) {
        try{
            exceptionMethod(1);
            exceptionMethod(2);
            exceptionMethod(3);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void exceptionMethod(int value) throws MyException, MySecondException, MyThirdException {
        switch (value){
            case 1 : throw  new MyException("FirstException");
            case 2: throw  new MySecondException("SecondException");
            case 3: throw  new MyThirdException("ThirdException");
        }
    }
}
