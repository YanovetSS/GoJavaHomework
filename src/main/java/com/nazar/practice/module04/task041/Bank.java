package com.nazar.practice.module04.task041;

import com.nazar.practice.module04.task042.Currency;

abstract public class Bank {
    long id;
    String bankCountry;
    Currency currency;
    int numberOfEmployees;
    long rating ;
    long totalCapital;

    //create contructor

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    //create getMethods

    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    //create setMethods

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
    public abstract int getLimitOfWithdrawal();
    public abstract int getLimitOfFunding();
    public abstract double getMonthlyRate();
    public abstract int getCommission(int summ);
    public  double moneyPaidMonhlyForSalery(){
        return 0.0;
    }
}
