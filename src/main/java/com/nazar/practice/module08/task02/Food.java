package com.nazar.practice.module08.task02;

import com.nazar.practice.module08.task01.IdGeneratorsUtil;

public class Food {
    private final int id;
    private String name;
    private String country;
    private int expiration;// срок годности в днях


    public Food(String name, String country, int expiration) {
        this.name = name;
        this.country = country;
        this.expiration = expiration;
        id= IdGeneratorsUtil.idGeneration(name,country,expiration);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "\n"+"id = " +id +"," +"name = "+name+ "," + "country = "+ country +"," +
                "expiration = "+expiration+"," +"price ";
    }


}
