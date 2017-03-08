package com.nazar.practice.module04.task046;

import com.nazar.practice.module04.task041.ChinaBank;
import com.nazar.practice.module04.task041.EUBank;
import com.nazar.practice.module04.task041.USBank;
import com.nazar.practice.module04.task042.Currency;
import com.nazar.practice.module04.task044.User;
import com.nazar.practice.module04.task045.BankSystemImpl;


public class Main {
    public static void main(String[] args) {
        BankSystemImpl  bankSystem = new BankSystemImpl();

        EUBank euBank = new EUBank(1,"Ua", Currency.EUR,10,28,
                100000000);
        USBank usBank = new USBank(2,"USA",Currency.USD,22,3,
                222222222);
        ChinaBank chinaBank = new ChinaBank(3,"China",Currency.EUR,13,
                1555,333333333);


        User user1 = new User(1000,"Nazar",100000,
                10,"Google",10000,euBank);

        User user2 = new User(1001,"Vitaliy",55000,
                12,"Microsoft",4000,euBank);
        User user3 = new User(1002,"Gabe",22000,
                14,"Amazon",80000,usBank);
        User user4 = new User(1003,"Green",10000,
                155,"Amazon",25000,usBank);
        User user5 = new User(1004,"LaoDzen",15000,
                16,"Steam",3000,chinaBank);
        User user6 = new User(1005,"Yochida",324000,
                3,"Ubisoft",2000,chinaBank);

        System.out.println("Work with first euBank user!");
        bankSystem.withdrawOfUser(user1, 100000);
        bankSystem.fundUser(user1,10000);
        bankSystem.transferMoney(user1,user2,1000);
        bankSystem.paySalery(user1);
        System.out.println("");

        System.out.println("Work with second euBank user!");
        bankSystem.withdrawOfUser(user2,500);
        bankSystem.fundUser(user2, 500);
        bankSystem.transferMoney(user2,user1, 10000);
        bankSystem.paySalery(user2);
        System.out.println("");

        System.out.println("Work with first usBank user!");
        bankSystem.withdrawOfUser(user3,500);
        bankSystem.fundUser(user3, 500);
        bankSystem.transferMoney(user3,user4, 10000);
        bankSystem.paySalery(user4);
        System.out.println("");

        System.out.println("Work with second usBank user!");
        bankSystem.withdrawOfUser(user4,500);
        bankSystem.fundUser(user4, 500);
        bankSystem.transferMoney(user4,user3, 10000);
        bankSystem.paySalery(user4);
        System.out.println("");

        System.out.println("Work with first chinaBank user!");
        bankSystem.withdrawOfUser(user5,500);
        bankSystem.fundUser(user5, 500);
        bankSystem.transferMoney(user5,user6, 10000);
        bankSystem.paySalery(user5);
        System.out.println("");

        System.out.println("Work with second chinaBank user!");
        bankSystem.withdrawOfUser(user6,500);
        bankSystem.fundUser(user6, 1000);
        bankSystem.transferMoney(user6,user5, 10000);
        bankSystem.paySalery(user6);

    }
}
