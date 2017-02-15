package com.nazar.practice.module03.task033;

/**
 * Created by MakeMeSm1Le- on 15.02.2017.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    // 2 kak v CollegeStudent
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, long secretKey) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
    }
    //get

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    //set

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
