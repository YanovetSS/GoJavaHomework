package com.nazar.practice.module07.task03;


import com.nazar.practice.module07.task01.Currency;
import com.nazar.practice.module07.task01.Order;
import com.nazar.practice.module07.task01.User;

import java.util.*;


public class Main {
    private static User user1 = new User(1, "Nazar", "Yanovets", "Kiev", 100000);
    private static User user2 = new User(2, "Oleg", "hrunow", "Rivne", 200000);
    private static User user3 = new User(3, "Sacha", "berezin", "Ankara", 50000);
    private static User user4 = new User(4, "Andriy", "prokopchyk", "Berezne", 30000);
    private static User user5 = new User(5, "Roman", "romanowich", "Bilyacha", 28000);
    private static User user6 = new User(6, "Anton", "tesenchyk", "Bila cerkwa", 30000);
    private static User user7 = new User(7, "Ivan", "sidorinko", "Vavilon", 500000);
    private static User user8 = new User(8, "Orest", "nesen", "Lviv", 60000);
    private static User user9 = new User(9, "Gabe", "neutsky", "London", 3000);
    private static User user10 = new User(10, "Olha", "Petrov", "Odessa", 80000);

    public static Set<Order> createOrderSet() {
        Order order1 = new Order(1, 500, Currency.GRN, "Milk", "Silpo", user1);
        Order order2 = new Order(2, 1000, Currency.GRN, "Bread", "Omega", user2);
        Order order3 = new Order(3, 1500, Currency.USD, "Apple", "Alpha", user3);
        Order order4 = new Order(4, 2000, Currency.GRN, "Fruit", "ameliya", user4);
        Order order5 = new Order(5, 2000, Currency.USD, "Juice", "xance", user5);
        Order order6 = new Order(6, 2000, Currency.GRN, "Meat", "Fitness Food", user6);
        Order order7 = new Order(7, 2000, Currency.USD, "Dress", "Zara", user7);
        Order order8 = new Order(8, 4000, Currency.GRN, "Dress", "Amsters", user8);
        Order order9 = new Order(8, 4000, Currency.GRN, "Dress", "Amsters", user9);
        Order order10 = new Order(10, 5000, Currency.GRN, "blouse", "Grinoske", user10);
        SortedSet<Order> ordersList = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice()) return 0;
                else if (o1.getPrice() < o2.getPrice()) return 1;
                else return -1;
            }
        });
        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);
        ordersList.add(order4);
        ordersList.add(order5);
        ordersList.add(order6);
        ordersList.add(order7);
        ordersList.add(order8);
        ordersList.add(order9);
        ordersList.add(order10);
        return ordersList;
    }
//-проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
    public static void setPetrov(Set<Order> orderSet) {
        for (Order order:
             orderSet) {
            if(order.getUser().getLastName().equals("Petrov")){
                System.out.println("orderSet contains User with second name Petrov");
            }
        };
    }
    //-выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
    public static void getLargestPrice(Set<Order> orderSet){
    }

    //-удалите заказы, где валюта доллар, используя Iterator
    public static void removeItemsWhenCurrencyUSD (Set<Order> orderSet){
        Iterator<Order> iterator = orderSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getCurrency().equals(Currency.USD)){
                iterator.remove();
            }
        }
        System.out.println(orderSet);
    }
    public static void main(String[] args) {
        Set ordersSet = createOrderSet();
        setPetrov(ordersSet);
        removeItemsWhenCurrencyUSD(ordersSet);
    }
}
