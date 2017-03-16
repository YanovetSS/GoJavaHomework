package com.nazar.practice.module06.task064;

public class CitizenFactory {

    private static class Englishman implements Citizen {
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    private static class Chineeseman implements Citizen {
        public void sayHello() {
            System.out.println("Hello CHineesman");
        }
    }

    private static class Russianman implements Citizen {
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    private static class Italianman implements Citizen {
        public void sayHello() {
            System.out.println("Hello Italiamman");
        }
    }

   public static Citizen returnHuman(String somethink) {
        if (somethink.equals("English")) {
            return new Englishman();
        } else if (somethink.equals("Chine")) {
            return new Chineeseman();
        } else if (somethink.equals("Russian")) {
            return new Russianman();
        } else if (somethink.equals("Italian")) {
            return new Italianman();
        } else
            throw new RuntimeException(somethink + " is unknown human");
    }

}
