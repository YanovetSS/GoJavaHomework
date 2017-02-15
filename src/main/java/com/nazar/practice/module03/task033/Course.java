package com.nazar.practice.module03.task033;

import java.util.Date;

/**
 * Created by MakeMeSm1Le- on 15.02.2017.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hourseDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, int hourseDuration, String teacherName) {
        this.name = name;
        this.hourseDuration = hourseDuration;
        this.teacherName = teacherName;
    }
    //get

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHourseDuration() {
        return hourseDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    //set

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourseDuration(int hourseDuration) {
        this.hourseDuration = hourseDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
