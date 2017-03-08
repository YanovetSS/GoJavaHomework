package com.nazar.practice.module04.task041;

import com.nazar.practice.module04.task042.Currency;

public class USBank extends Bank {
    private static final int TRESHHOLD_USD_OR_EU_MONEY = 1000;
    private static final double COMMISION_WHEN_TRESHHOLD_USD_MONEY_LOWER_THEN_1000 = 0.05;
    private static final double COMMISION_WHEN_TRESHHOLD__USD_MONEY_BIGGEST_THEN_1000 = 0.07;
    private static final double COMMISION_WHEN_TRESHHOLD_EU_MONEY_LOWER_THEN_1000 = 0.06;
    private static final double COMMISION_WHEN_TRESHHOLD__EU_MONEY_BIGGEST_THEN_1000 = 0.08;

    private static final int  LIMIT_OF_WITHDRAW_MONEY_WHEN_CURRENCY_IS_USD =1000;
    private static final int  LIMIT_OF_WITHDRAW_MONEY_WHEN_CURRENCY_IS_EUR =1200;
    private static final int  LIMIT_OF_FUNDING_MONEY_WHEN_CURRENCY_IS_EUR = 10000;
    private static final double  MONTHLY_RATE_WHEN_CURRENCY_IS_USD =0.01;
    private static final double  MONTHLY_RATE_WHEN_CURRENCY_IS_EUR =0.02;

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            System.out.println("Limit of Withdraw money - 1000 ");
            return LIMIT_OF_WITHDRAW_MONEY_WHEN_CURRENCY_IS_USD;
        } else if (getCurrency() == Currency.EUR) {
            System.out.println("Limit of Withdraw money - 1200");
            return LIMIT_OF_WITHDRAW_MONEY_WHEN_CURRENCY_IS_EUR;
        }
        return 0;
    }

    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return LIMIT_OF_FUNDING_MONEY_WHEN_CURRENCY_IS_EUR;
        }
        return 0;
    }

    public double getMonthlyRate() {
        if (getCurrency() == Currency.EUR) {
            return MONTHLY_RATE_WHEN_CURRENCY_IS_EUR;
        }
        if (getCurrency() == Currency.USD) {
            return MONTHLY_RATE_WHEN_CURRENCY_IS_USD;
        }
        return 0;
    }

    public int getCommission(int summ) {
        if (getCurrency() == Currency.USD) {
            if (summ < TRESHHOLD_USD_OR_EU_MONEY) {
                System.out.print("Commission: ");

                return (int) (summ * COMMISION_WHEN_TRESHHOLD_USD_MONEY_LOWER_THEN_1000);
            } else if (summ > TRESHHOLD_USD_OR_EU_MONEY) {
                System.out.print("Commission: ");
                return (int) (summ * COMMISION_WHEN_TRESHHOLD__USD_MONEY_BIGGEST_THEN_1000);
            }
        } else if (getCurrency() == Currency.EUR) {
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



    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, rating, totalCapital);
    }
}
