package com.nazar.practice.module06.task063;

import com.nazar.practice.module06.task062.User;

public final class UserUtils {
    private UserUtils() {
    }

    // write
    //User[] uniqueUsers(User[] users) – находит и возвращает уникальных пользователей (пользователи одинаковы, когда все их поля совпадают)
    public static User[] uniqueUsers(User[] users) {
        boolean flag = true;
        int index = 0;
        User[] uniqueUserArray = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    flag = false;
                    index++;
                }
            }
            if (flag) {
                uniqueUserArray[i] = users[i];
            }
            flag = true;
        }
        return deleteEmptyUsers(uniqueUserArray);
    }


    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersArrayForTrueBalances = new User[users.length];
        int index = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                usersArrayForTrueBalances[index++] = user;
            }
        }
        return deleteEmptyUsers(usersArrayForTrueBalances);
    }

    public static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalery());
        }
        return users;
    }

    public static long[] getUsersId(User[] users) {
        long[] idArray = new long[users.length];
        int index = 0;
        for (User user : users) {
            idArray[index++] = user.getId();
        }
        return idArray;
    }

    //delete fucking null
    public static User[] deleteEmptyUsers(User[] users) {
        int counter = 0;
        for (User user : users) {
            if (user == null) {
                counter++;
            }
        }
        User[] nonNullUsersArray = new User[users.length - counter];
        counter = 0;
        for (User user : users) {
            if (user != null) {
                nonNullUsersArray[counter++] = user;
            }
        }
        return nonNullUsersArray;
    }
}
