package com.nazar.practice.module08.task05;


import com.nazar.practice.module08.task02.Food;
import com.nazar.practice.module08.task03.IManageSystemImpl;

public class Main {
    public static void main(String[] args) {
        IManageSystemImpl iManageSystem = new IManageSystemImpl();
        Food food1 = new Food("KArtopla","Ukraine",32);
        Food food2 = new Food("Morkwa","Ukraine",31);
        Food food3 = new Food("Ogirok","Ukraine",10);
        Food food4 = new Food("Pomidor","Ukraine",7);
        Food food5 = new Food("Ananas","Ukraine",5);

        System.out.println("Print my DB");
        iManageSystem.save(food1);
        iManageSystem.save(food2,100);
        iManageSystem.save(food3,150);
        iManageSystem.save(food4,200);
        iManageSystem.save(food5,300);
        iManageSystem.printMyDB();

        System.out.print("Delete some food");
        iManageSystem.delete(food2);

        System.out.println("Price = "+ iManageSystem.getPrice(food3));

        iManageSystem.deleteById(1);

        iManageSystem.get(12131);

        System.out.println("Get price " +iManageSystem.getPrice(food4));

        System.out.println("Get list products : "+iManageSystem.getProducts());
        System.out.println("Get list prices : "+iManageSystem.getPrices());

        System.out.println("---------------------");
        iManageSystem.printProductsSortedByName();
        iManageSystem.printProductsSortedByPrice();
    }

}
