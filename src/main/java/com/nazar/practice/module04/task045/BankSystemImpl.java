package com.nazar.practice.module04.task045;


import com.nazar.practice.module04.task044.User;

public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        System.out.println("withdrawMoney****");
        if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Sorry, you want take too much");
        } else {
            System.out.println("Commision:" + amount * user.getBank().getMonthlyRate());
            user.setBalance(user.getBalance() - amount - amount * user.getBank().getMonthlyRate());
            System.out.println("New balance of User" + user.getName() + " is : " + user.getBalance());
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
    /*Треба провірити чи однакові валюти у юзерів,  і по факту треба для першого реалізувати
    */

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            toUser.setBalance(toUser.getBalance() + amount);
            if (amount < (fromUser.getBalance() + amount * fromUser.getBank().getMonthlyRate())) {
                fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getMonthlyRate());
            } else {
                System.out.println("You want transfer too many...see you current balance");
            }
        } else {
            System.out.println("Please follow the transactions between the same-named currency");
        }
        System.out.println("toUser" + "(" + toUser.getName() + ")" + " have a new balance: " + toUser.getBalance());
        System.out.println("from user" + "(" + fromUser.getName() + ")" + "have a new balance: " + fromUser.getBalance());
    }

    public void paySalery(User user) {
        user.setBalance(user.getBalance() + user.getSalery());
        System.out.println("new balance from user" + "(" + user.getName() + ")" + "when we have a salery: "
                + user.getBalance());
    }
}

