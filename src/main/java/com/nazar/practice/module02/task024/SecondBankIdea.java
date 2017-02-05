package com.nazar.practice.module02.task024;

import java.util.Scanner;

/**
 * Created by MakeMeSm1Le- on 03.02.2017.
 */
public class SecondBankIdea {
    public static void main(String[] args) {
        SecondBankIdea object = new SecondBankIdea();
        int[] arrayOfBalancesUserMoney = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        object.fundAndPrintMoneyOnUserArrayOfBalancesUserMoney(arrayOfBalancesUserMoney,ownerNames);
    }
    public void fundAndPrintMoneyOnUserArrayOfBalancesUserMoney(int[] arrayOfBalancesUserMoney, String[] ownerNames){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String inputUserName =  input.next();
        System.out.print("Enter value of fund: ");
        int fundMoney = input.nextInt();
        boolean ownerNamesFlag =false;
        for (int i = 0; i < ownerNames.length; i++) {
            if(ownerNames[i].equals(inputUserName)){
                ownerNamesFlag=true;
                System.out.println(ownerNames[i]
                        + "\nYour current balance: "
                        + (arrayOfBalancesUserMoney[i]+fundMoney));
                break;
            }
        }
        if(!ownerNamesFlag){
            System.out.println("Sorry, you are not in our database");
        }
    }
}
