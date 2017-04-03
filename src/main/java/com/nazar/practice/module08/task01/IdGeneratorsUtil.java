package com.nazar.practice.module08.task01;



public final class  IdGeneratorsUtil {

    public static int  idGeneration(String name, String country, int expiration){
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + expiration;
        return result;
    }

    private IdGeneratorsUtil() {
    }
}
