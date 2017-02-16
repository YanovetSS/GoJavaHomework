package com.nazar.practice.module03.task033;


import java.util.Date;

/**
 * Created by MakeMeSm1Le- on 15.02.2017.
 */
public class Sollution {
    public static void main(String[] args) {
        Course someStudent1 = new Course("Nazar", 100, "Andrey");
        Course someStudent2 = new Course("Vitalik", 30, "Gabe");
        Course someStudent3 = new Course("SomeName", 1000, "NoName");
        Course someStudent4 = new Course("SomeName", 2000, "NoName");
        Course someStudent5 = new Course(new Date(), "Nazar");

        Student someStudent6 = new Student("Nazar", "Yanovets", 6);
        Student someStudent7 = new Student("Yanovets", new Course[]{someStudent1, someStudent2, someStudent3});
        CollegeStudent someExampleStudent8 = new CollegeStudent("Nazar", "Yanovets", 6);
        CollegeStudent someExampleStudent9 = new CollegeStudent("Yanovets",
                new Course[]{someStudent4, someStudent5});
        CollegeStudent someExampleStudent10 = new CollegeStudent("kpi", 1000, 1002);
        SpecialStudent someSpecialStudent11 = new SpecialStudent("Nazar", "Yanovets", 6);
        SpecialStudent someSpecialStudent12 = new SpecialStudent(
                "Nazar", "Yanovets", 6, "kpi", 1000, 2000);
        SpecialStudent someSpecialStudent13 = new SpecialStudent(100000, "Yanovetswork@gmail.com");
    }
}
