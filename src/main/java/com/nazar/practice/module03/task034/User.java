package com.nazar.practice.module03.task034;

import java.util.Scanner;


public class User {
    private String name;
    private Integer balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }
    //get

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }
    //set

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private static final double COMISION_LESS_1000_DOLLARS = 0.05d;
    private static final double COMISION_MORE_1000_DOLLARS = 0.1d;

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
        System.out.print("\nEnter withdrawMoney value: - ");
        Scanner in = new Scanner(System.in);
        int withdrawMoney = in.nextInt();
        if (user.getBalance() > withdrawMoney) {
            if (withdrawMoney <= 1000) {
                user.setBalance(user.getBalance() - (int) (COMISION_LESS_1000_DOLLARS * withdrawMoney + withdrawMoney));
                System.out.println("Balance now(withdrawMoney): - " + user.getBalance());
            } else if (withdrawMoney > 1000) {
                user.setBalance(user.getBalance() - (int) (COMISION_MORE_1000_DOLLARS * withdrawMoney + withdrawMoney));
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
