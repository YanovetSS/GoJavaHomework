package com.nazar.practice.module04.task045;


import com.nazar.practice.module04.task044.User;

public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user , int amount);
    void transferMoney(User fromUser,User toUser,int amount);
    void paySalery(User user);

}
