package com.nazar.practice.module06.task063;


import com.nazar.practice.module06.task062.User;

import java.util.Arrays;

public class UsersMain {
    public static void main(String[] args) {
        User exampleUser1 = new User(100, "Nazar", "Yanovets", 2000, 24000);
        User exampleUser2 = new User(267676, "Ivan", "Grechaniy", 1500, 24000);
        User exampleUser3 = new User(28989898, "Andriy", "Smolets", 1130, 2400);
        User exampleUser4 = new User(100, "Nazar", "Yanovets", 2000, 24000);

        User[] usersArray = {exampleUser1, exampleUser2, exampleUser3,exampleUser4};
        System.out.println("Initial array:\n" + Arrays.toString(usersArray));
        System.out.println("\nusersWithContitionalBalance: -> "
                +Arrays.toString(UserUtils.usersWithContitionalBalance(usersArray, 24000)));
        System.out.println("paySalaryToUsers: ->"
                +Arrays.toString(UserUtils.paySalaryToUsers(usersArray)));
        System.out.println("Users id: ->"+Arrays.toString(UserUtils.getUsersId(usersArray) ));
        System.out.println("Unique users: ->"+Arrays.toString(UserUtils.uniqueUsers(usersArray)));

    }
}
