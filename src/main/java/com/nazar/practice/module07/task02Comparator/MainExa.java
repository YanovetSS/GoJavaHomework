package com.nazar.practice.module07.task02Comparator;


import com.nazar.practice.module07.task01.Currency;
import com.nazar.practice.module07.task01.Order;
import com.nazar.practice.module07.task01.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MainExa {
    private static User user1 = new User(1, "Nazar", "Yanovets", "Kiev", 100000);
    private static User user2 = new User(2, "Oleg", "hrunow", "Rivne", 200000);
    private static User user3 = new User(3, "Sacha", "berezin", "Ankara", 50000);
    private static User user4 = new User(4, "Andriy", "prokopchyk", "Berezne", 30000);
    private static User user5 = new User(5, "Roman", "romanowich", "Bilyacha", 28000);
    private static User user6 = new User(6, "Anton", "tesenchyk", "Bila cerkwa", 30000);
    private static User user7 = new User(7, "Ivan", "sidorinko", "Vavilon", 500000);
    private static User user8 = new User(8, "Orest", "nesen", "Lviv", 60000);
    private static User user9 = new User(9, "Gabe", "neutsky", "London", 3000);
    private static User user10 = new User(10, "Olha", "petrova", "Odessa", 80000);

    public static List<Order> createOrderList() {
        Order order1 = new Order(1, 500, Currency.USD, "Milk", "Silpo", user1);
        Order order2 = new Order(2, 1000, Currency.GRN, "Bread", "Omega", user2);
        Order order3 = new Order(3, 1500, Currency.USD, "Apple", "Alpha", user3);
        Order order4 = new Order(4, 2000, Currency.GRN, "Fruit", "ameliya", user4);
        Order order5 = new Order(5, 2000, Currency.USD, "Juice", "xance", user5);
        Order order6 = new Order(6, 2000, Currency.GRN, "Meat", "Fitness Food", user6);
        Order order7 = new Order(7, 2000, Currency.USD, "Dress", "Zara", user7);
        Order order8 = new Order(8, 4000, Currency.GRN, "Dress", "Amsters", user8);
        Order order9 = new Order(9, 4500, Currency.USD, "Dress", "Dezet", user9);
        Order order10 = new Order(10, 5000, Currency.GRN, "blouse", "Grinoske", user10);
        List<Order> ordersList = new ArrayList<Order>();
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

    //видаляю елементи зі списку якщо повторюєтиься ім*я товару
    public static void removeElementsByItemName(List<Order> orderList) {

        for (int i = 0; i < orderList.toArray().length; i++) {
            for (int j = i + 1; j < orderList.toArray().length; j++) {
                if (orderList.get(i).getItemName().equals(orderList.get(j).getItemName())) {
                    orderList.remove(j);
                    j--;
                }
            }
        }
    }

    //видаляю елементи зі списку якщо ціна <1500

    // розділяю елементи по грошах
    public static void sortCollectionByCurrency(List<Order> orderList) {
        List<Order> orderListByCurrencyUSD = new ArrayList<Order>();
        List<Order> orderListByCurrencyGRN = new ArrayList<Order>();
        for (Order q : orderList) {
            if (q.getCurrency().equals(Currency.USD)) {
                orderListByCurrencyUSD.add(q);
            } else if(q.getCurrency().equals(Currency.GRN)){
                orderListByCurrencyGRN.add(q);
            } else{
                System.out.println("you have a bad currency" +q);
            }
        }
        System.out.println("List by currencyUSD\n" + orderListByCurrencyUSD);
        System.out.println("List by currencyGRN\n" + orderListByCurrencyGRN);
    }

    public static void main(String[] args) {
        List<Order> ordersList = createOrderList();
        // (FIRST )  sort by price
        ordersList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Integer.compare(o1.getPrice(),o2.getPrice());
            }
        });
        System.out.println("sort by price....");
        System.out.println(ordersList);

        //(SECOND ) sort by price and city

        ordersList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int i = o1.getPrice() - o2.getPrice();
                if(i == 0){
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return  i;
            }
        });

        System.out.println("sort by city and price....");
        System.out.println(ordersList);

        //(THIRD) sor by items name and shop identificator
        ordersList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().equals(o2.getItemName())) {
                    int result = o1.getShopIdentificator().compareToIgnoreCase(o2.getShopIdentificator());
                    if (result == 0) {
                        return o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
                    } else
                        return result;
                } else {
                    return o1.getItemName().compareToIgnoreCase(o2.getItemName());
                }
            }
        });

        System.out.println("sort by item name and shop identificator");
        System.out.println(ordersList);

        //-удалите дублированные данные со списка
        System.out.println("deleyte double itemNames elements");
        removeElementsByItemName(ordersList);
        System.out.println(ordersList);

        //-удалите объекты, где цена меньше 1500
        System.out.println("Remove items when price < 1500");
        ordersList.removeIf(new Predicate<Order>() {
            @Override
            public boolean test(Order order) {
                return order.getPrice() < 1500;
            }
        });
        System.out.println(ordersList);


        // -разделите список на 2 списка - заказы в долларах и в гривнах
        //перестворюю колекцію
        System.out.println("Sorted by Currency...");
        ordersList = createOrderList();
        sortCollectionByCurrency(ordersList);

//        System.out.println("Nazar collection:");
//        List<Order> orders = new ArrayList<>();
//        generateList(orders);
//
//        List<Order> orders1 = new ArrayList<>(orders);
//
//        Date startDate, endDate;
//        startDate = new Date();
//        removeElements(orders);
//        System.out.println(orders);
//        endDate = new Date();

//        System.out.println("Nazar time: " + (endDate.getTime() - startDate.getTime()));
    }

}




