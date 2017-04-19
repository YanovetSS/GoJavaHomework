package com.nazar.practice.module10.task01.task04;

import com.nazar.practice.module10.task01.task02.MyException;

public class ExampleClass {

    public static void g() throws MyException{
        throw  new MyException("My Exception!");
    }

    public static void f() throws MySecondException {
        try{
            g();
        }catch (MyException q){
            throw  new MySecondException("Second Exception in action!");
        }
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MySecondException e){
            System.out.println(e.getMessage());
        }
    }
}
