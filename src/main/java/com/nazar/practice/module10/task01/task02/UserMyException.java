package com.nazar.practice.module10.task01.task02;

public class UserMyException  {
    public static void main(String[] args) {
        try {
            throw new MyException("Testing MyException");
        }catch (MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
