package com.nazar.practice.module09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static User user1 = new User(1, "Nazar", "Yanovets", "Kiev", 100000);
    private static User user2 = new User(2, "Oleg", "Yanovets", "Rivne", 200000);
    private static User user3 = new User(3, "Oleg", "Petrow", "Ankara", 200000);
    private static User user4 = new User(4, "Oleg", "Yanovets", "Berezne", 200000);
    private static User user5 = new User(55, "Oleg", "Yanovets", "Anko", 200000);
    private static User user6 = new User(66, "Stepan", "Good", "Beko", 200000);
    private static User user7 = new User(88, "Vasya", "Day", "Zako", 200000);

    public static List<Order> createorderList() {
        Order Order1 = new Order(1, 500, Currency.GRN, "Milk", "Silpo", user1);
        Order Order2 = new Order(2, 1000, Currency.GRN, "Bread", "Omega", user2);
        Order Order3 = new Order(3, 1500, Currency.USD, "Apple", "Alpha", user3);
        Order Order4 = new Order(4, 2000, Currency.GRN, "Fruit", "ameliya", user4);
        Order Order5 = new Order(5, 2000, Currency.USD, "Meat", "xance", user5);
        Order Order6 = new Order(6, 2000, Currency.GRN, "Meat", "Fitness Food", user6);
        Order Order7 = new Order(7, 2000, Currency.USD, "Meat", "sds", user7);
        List<Order> orderList = new ArrayList<Order>();
        orderList.add(Order1);
        orderList.add(Order2);
        orderList.add(Order3);
        orderList.add(Order4);
        orderList.add(Order5);
        orderList.add(Order6);
        orderList.add(Order7);
        return orderList;
    }

    public static void sortPrice(List<Order> orderList) {
        System.out.println("Sort by Price");
        orderList.sort(Comparator.comparing(Order::getPrice).reversed());
        System.out.println(orderList);
    }

    public static void sortByPriceAndCity(List<Order> orderList) {
        System.out.println("\n Sort by Price and City");
        orderList.sort(Comparator.comparing(Order::getPrice)
                .thenComparing((Order1, Order2) -> Order1.getUser().getCity().compareTo(Order2.getUser().getCity())));
        System.out.println(orderList);
    }

    public static void sortByShopIdentificatorAndUserCity(List<Order> orderList) {
        System.out.println("\nsort by ItemName, identificator and userCity");
        orderList.sort(Comparator.comparing(Order::getItemName)
                .thenComparing((Order1, Order2) -> Order1.getShopIdentificator().compareTo(Order2.getShopIdentificator()))
                .thenComparing((Order1, Order2) -> Order1.getUser().getCity().compareTo(Order2.getUser().getCity())));
        System.out.println(orderList);
    }

    public static void DeleteDuplicateElementsOnList(List<Order> orderList) {
        System.out.println("\nDelete duplicate element's");
        List<Order> uniqueOrders = orderList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueOrders);
    }

    public static void printElementWhenPriceBiggestThen1500(List<Order> orderList) {
        System.out.println("\nprint Elemnent's when price biggest then 1500: ");
        List<Order> biggestPriceOrders = orderList.stream()
                .filter(order -> order.getPrice() > 1500).collect(Collectors.toList());
        System.out.println(biggestPriceOrders);
    }

    public static void printCollectByCurrency(List<Order> orderList) {
        System.out.println("\n Print collect by Currency");
        Map<Currency, List<Order>> ordersByCurrency = orderList.stream()
                .collect(Collectors.groupingBy(Order::getCurrency));
        System.out.println(ordersByCurrency);
    }

    public static void setPetrowUser(List<Order> orderList) {
        System.out.println("\nset Petrow(second name): ");
        boolean setPetrow = orderList.stream().anyMatch(order -> order.getUser().getLastName().equals("Petrow"));
        System.out.println(setPetrow);
    }

    public static void deleteOrderWhenCurrencyIsUSD(List<Order> listOrder) {
        System.out.println("\ndeleteOrderWhenCurrencyIsUSD: ");
        List<Order> listWhereOrderCurrencyIsGRN = listOrder
                .stream().filter(order -> order.getCurrency().equals(Currency.GRN)).collect(Collectors.toList());
        System.out.println(listWhereOrderCurrencyIsGRN);
    }

    public static void main(String[] args) {
        List orderList = createorderList();
        sortPrice(orderList);
        sortByPriceAndCity(orderList);
        sortByShopIdentificatorAndUserCity(orderList);
        DeleteDuplicateElementsOnList(orderList);
        printElementWhenPriceBiggestThen1500(orderList);
        printCollectByCurrency(orderList);
        setPetrowUser(orderList);
        deleteOrderWhenCurrencyIsUSD(orderList);
    }
}
