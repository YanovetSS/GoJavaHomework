package com.nazar.practice.module02.task023;


import java.util.Scanner;

/**
 * Created by MakeMeSm1Le- on 01.02.2017.
 */
public class BankIdea {
    private static final double commisionWithdrawMoney = 0.05;// приватное поле класа BankIdea
    public static void main(String[] args) {
        int[] arrayOfBalancesUserMoney = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        BankIdea object = new BankIdea();
        object.withdrawAndPrintMoneyOnUserarrayOfBalancesUserMoney(arrayOfBalancesUserMoney, ownerNames);
    }

    public void withdrawAndPrintMoneyOnUserarrayOfBalancesUserMoney(int[] arrayOfBalancesUserMoney, String[] ownerNames) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String inputUserName = input.next();
        System.out.print("Withdraw money: ");
        int withdrawMoney = input.nextInt();
        boolean ownerNamesFlag = false;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(inputUserName)) {
                ownerNamesFlag = true;
                if (arrayOfBalancesUserMoney[i] >= withdrawMoney + commisionWithdrawMoney * withdrawMoney) {
                    System.out.println("");
                    System.out.println("Operation is successful; " + "\nCommision: "+commisionWithdrawMoney * withdrawMoney + "; "
                            + "\nYour current balance: "
                            + (arrayOfBalancesUserMoney[i] - (withdrawMoney + commisionWithdrawMoney * withdrawMoney)));
                } else {
                    System.out.println("Sorry, but you want to take too much");
                }
            }
        }
        if (!ownerNamesFlag) {
            System.out.println("Sorry, you are not in our database");
        }
    }


}
