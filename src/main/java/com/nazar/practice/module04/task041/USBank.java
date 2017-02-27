package com.nazar.practice.module04.task041;

import com.nazar.practice.module04.task042.Currency;
import com.nazar.practice.module04.task044.User;

public class USBank extends Bank {
    private static final int TRESHHOLD_USD_OR_EU_MONEY = 1000;
    private static final double COMMISION_WHEN_TRESHHOLD_USD_MONEY_LOWER_THEN_1000 = 0.05;
    private static final double COMMISION_WHEN_TRESHHOLD__USD_MONEY_BIGGEST_THEN_1000 = 0.07;
    private static final double COMMISION_WHEN_TRESHHOLD_EU_MONEY_LOWER_THEN_1000 = 0.06;
    private static final double COMMISION_WHEN_TRESHHOLD__EU_MONEY_BIGGEST_THEN_1000 = 0.08;

    public int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            System.out.println("Limit of Withdraw money - 1000 ");
            return 1000;
        } else if (currency == Currency.EUR) {
            System.out.println("Limit of Withdraw money - 1200");
            return 1200;
        }
        return 0;
    }

    public int getLimitOfFunding() {
        if (currency == Currency.EUR) {
            return 10000;
        }
        return 0;
    }

    public double getMonthlyRate() {
        if (currency == Currency.EUR) {
            return 0.02;
        }
        if (currency == Currency.USD) {
            return 0.01;
        }
        return 0;
    }

    public int getCommission(int summ) {
        if (currency == Currency.USD) {
            if (summ < TRESHHOLD_USD_OR_EU_MONEY) {
                System.out.print("Commission: ");

                return (int) (summ * COMMISION_WHEN_TRESHHOLD_USD_MONEY_LOWER_THEN_1000);
            } else if (summ > TRESHHOLD_USD_OR_EU_MONEY) {
                System.out.print("Commission: ");
                return (int) (summ * COMMISION_WHEN_TRESHHOLD__USD_MONEY_BIGGEST_THEN_1000);
            }
        } else if (currency == Currency.EUR) {
            if (summ < TRESHHOLD_USD_OR_EU_MONEY) {
                System.out.print("Commission: ");
                return (int) (summ * COMMISION_WHEN_TRESHHOLD_EU_MONEY_LOWER_THEN_1000);
            } else if (summ > TRESHHOLD_USD_OR_EU_MONEY) {
                System.out.print("Commission: ");
                return (int) (summ * COMMISION_WHEN_TRESHHOLD__EU_MONEY_BIGGEST_THEN_1000);
            }
        }
        return 0;
    }


    public double moneyPaidMonhlyForSalery(User user) {
        return user.getMonthsOfEmployment() * user.getSalery() ;
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, rating, totalCapital);
    }
}
