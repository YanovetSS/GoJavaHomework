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
        Food food5 = new Food("Ananas","Ukraine",7);
        Food food6 = new Food("Opeska","Ukraine",9);
        Food food7 = new Food("Vishna","Ukraine",10);
        Food food8 = new Food("Giro","Ukraine",23);


        System.out.println("Print my DB");
        iManageSystem.save(food1);
        iManageSystem.save(food2,100);
        iManageSystem.save(food3,150);
        iManageSystem.save(food4,200);
        iManageSystem.save(food5,300);
        iManageSystem.save(food6,400);
        iManageSystem.save(food7,350);
        iManageSystem.save(food8,250);
        iManageSystem.printMyDB();

        System.out.print("Delete some food");
        iManageSystem.delete(food2);

        System.out.println("Price = "+ iManageSystem.getPrice(food3));

        iManageSystem.deleteById(food4.getId());

        iManageSystem.get(12131);

        System.out.println("Get price " +iManageSystem.getPrice(food4));

        System.out.println("Get list products : "+iManageSystem.getProducts());
        System.out.println("Get list prices : "+iManageSystem.getPrices());

        System.out.println("---------------------");
        iManageSystem.printProductsSortedByName();
        iManageSystem.printProductsSortedByPrice();
    }

}
