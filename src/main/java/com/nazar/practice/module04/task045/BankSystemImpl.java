package com.nazar.practice.module04.task045;


import com.nazar.practice.module04.task042.Currency;
import com.nazar.practice.module04.task044.User;

import java.util.Scanner;

public class BankSystemImpl implements BankSystem {
    Currency currency;

    public void withdrawOfUser(User user, int amount) {
        System.out.println("withdrawMoney****");
        if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Sorry, you want take too much");
        } else {
            System.out.println("Commision:" + amount * user.getBank().getMonthlyRate());
            System.out.println(" balance of " + user.getName() + " is :" + user.getBalance());
        }

    }

    public void fundUser(User user, int amount) {
        System.out.println("fund user****");
        if (amount > user.getBank().getLimitOfFunding()) {
            System.out.println("sorry, but we have funding limit:" + user.getBank().getLimitOfFunding());
        } else {
            user.setBalance(user.getBalance() + amount);
            System.out.println("new balance of " + user.getName() + " " + user.getBalance());
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println("transfers****");
        // даю новому юзеру його баланс + гроші які переводить fromUser
        toUser.setBalance(toUser.getBalance() + amount);
        System.out.println("toUser" + "(" + toUser.getName() + ")" + " have a new balance: " + toUser.getBalance());
        // записую нове значення балансу юзеру який переводить гроші
        if (fromUser.getBank().getMonthlyRate() == 0) {
            fromUser.setBalance(fromUser.getBalance() - amount);
        } else {
            fromUser.setBalance(fromUser.getBalance() - (amount * fromUser.getBank().getMonthlyRate() + amount));
        }
        System.out.println("from user" + "(" + fromUser.getName() + ")" + "have a new balance: " + fromUser.getBalance());

    }

    public void paySalery(User user) {
        user.setBalance(user.getBalance() + user.getSalery());
        System.out.println("new balance from user" + "(" + user.getName() + ")" + "when we have a salery: "
                + user.getBalance());
    }
}

