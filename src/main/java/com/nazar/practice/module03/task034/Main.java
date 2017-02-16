package com.nazar.practice.module03.task034;

import java.util.Scanner;

/**
 * Created by MakeMeSm1Le- on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        // create object
        User exampleObject = new User("Nazar", 20000, 11,
                "Google", 2000, "dollars");
        System.out.println("Example object: - " + exampleObject.getName() +
                "\nBalance: - " + exampleObject.getBalance() +
                "\nMonthsOfEmployment: - " + exampleObject.getMonthsOfEmployment() +
                "\nGoogle: - " + exampleObject.getCompanyName() +
                "\nSalary: - " + exampleObject.getSalary() +
                "\nCurrency: - " + exampleObject.getCurrency() + "\n");

        paySalaryForExampleObject(exampleObject);
        withdrawMoneyOnUserBalance(exampleObject);
        companyNameLenght(exampleObject);
        monthIncreaser(exampleObject);
    }

    private static void paySalaryForExampleObject(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("When we have a pay. Balance now: - " + user.getBalance());
    }

    private static void withdrawMoneyOnUserBalance(User user) {
        final double comisionWhenWithdrawMoneyLow1000 = 0.05d;
        final double comisionWhenWithdrawMoneyLargest1000 = 0.1d;
        System.out.print("\nEnter withdrawMoney value: - ");
        Scanner in = new Scanner(System.in);
        int withdrawMoney = in.nextInt();
        if (user.getBalance() > withdrawMoney) {
            if (withdrawMoney <= 1000) {
                user.setBalance(user.getBalance() - (int) (comisionWhenWithdrawMoneyLow1000 * withdrawMoney + withdrawMoney));
                System.out.println("Balance now(withdrawMoney): - " + user.getBalance());
            } else if (withdrawMoney > 1000) {
                user.setBalance(user.getBalance() - (int) (comisionWhenWithdrawMoneyLargest1000 * withdrawMoney + withdrawMoney));
                System.out.println("Balance now(withdrawMoney): - " + user.getBalance());
            }
        } else {
            System.out.println("Sorry but you want take too much");
        }
    }



    private static void companyNameLenght(User user) {
        System.out.println("\nCompany name Lenght: - " + user.getCompanyName().length());
    }

    private static void monthIncreaser(User user) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter value of Month job: - ");
        user.setMonthsOfEmployment(user.getMonthsOfEmployment() + in.nextInt());
        System.out.println("monthsOfEmployment : - " + user.getMonthsOfEmployment());
    }
}
