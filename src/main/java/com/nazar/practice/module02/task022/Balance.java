package com.nazar.practice.module02.task022;


import java.util.Scanner;

/**
 * Created by MakeMeSm1Le- on 01.02.2017.
 */
public class Balance {
    private static final double commisionWithdrawMoney = 0.05;
    public static void main(String[] args) {
        Balance object = new Balance();
        int balanceOfMoney = 10000;
        int withdrawUserMoney;
        Scanner in = new Scanner(System.in);
        System.out.print("Withdraw money. Enter value:");
        withdrawUserMoney = in.nextInt();

        object.printAndcalculationCurrentUserBalance(balanceOfMoney, withdrawUserMoney);
    }

    public void printAndcalculationCurrentUserBalance(int balanceOfMoney, int withdrawUserMoney) {
        if (balanceOfMoney >= withdrawUserMoney + commisionWithdrawMoney * withdrawUserMoney) {
            System.out.println("Operation is successful; "
                    + commisionWithdrawMoney * withdrawUserMoney + "; "
                    + (balanceOfMoney - (withdrawUserMoney + commisionWithdrawMoney * withdrawUserMoney)));
        } else {
            System.out.println("Sorry, but you want to take too much");
        }
    }
}
