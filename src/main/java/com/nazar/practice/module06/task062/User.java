package com.nazar.practice.module06.task062;


public final class User {
    private  long id;
    private String firstName;
    private String lastName;
    private int salery;
    private int balance;

    public User(long id, String firstName, String lastName, int salery, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salery = salery;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (salery != user.salery) return false;
        if (balance != user.balance) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        return lastName != null ? lastName.equals(user.lastName) : user.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + salery;
        result = 31 * result + balance;
        return result;
    }

    @Override
    public String toString() {
        return  firstName +" " +  lastName ;
    }

}
