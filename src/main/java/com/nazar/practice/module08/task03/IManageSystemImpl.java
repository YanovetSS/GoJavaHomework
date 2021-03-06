package com.nazar.practice.module08.task03;

import com.nazar.practice.module08.task02.Food;

import java.util.*;

public class IManageSystemImpl implements IManageSystem<Food> {
    private Map<Food, Double> dataBase = new HashMap<>();

    private static final Double DEFAULT_PRICE = 0.0D;

    @Override
    public Food save(Food obj, double price) {
        dataBase.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        dataBase.put(obj, DEFAULT_PRICE);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        dataBase.remove(obj);
        System.out.println(" - " + obj);
    }

    @Override
    public void deleteById(int id) {
        // Map не можна видалаяти через forech , мапа зміщається і форіч падає разом з мапою.
        // Мап видаляти тільки через ітератор!!!!!!!!!!
        Iterator<Map.Entry<Food, Double>> iterator = dataBase.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().getId() == id) {
                System.out.println("delete by id " + id + " product - " + iterator.next().getKey().getName());
                iterator.remove();
            }
        }
    }

    @Override
    public Food get(int id) {
        for (Map.Entry<Food, Double> entry : dataBase.entrySet()) {
            if (id == entry.getKey().getId()) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        if (obj == null) {
            System.out.println("Object does not exist in the database ");
        }
        return dataBase.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        Set foodSet = new HashSet<Food>(dataBase.keySet());
        return foodSet;
    }

    @Override
    public List<Double> getPrices() {
        List pricesList = new ArrayList(dataBase.values());
        return pricesList;
    }

    public void printMyDB() {
        System.out.println(dataBase);
    }

    @Override
    public void printProductsSortedByName() {
        System.out.println("Print products sorted by name(Key): ");
        TreeMap<Food, Double> dataBase1 = new TreeMap<Food, Double>(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        dataBase1.putAll(dataBase);
        System.out.println(dataBase1);
    }

    @Override
    public void printProductsSortedByPrice() {
        System.out.println();
        System.out.print("Print product sorted by Price(Value): ");

        List<Map.Entry<Food, Double>> entries = new ArrayList<Map.Entry<Food, Double>>(dataBase.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Food, Double>>() {
            @Override
            public int compare(Map.Entry<Food, Double> o1, Map.Entry<Food, Double> o2) {
                Double value1 = o1.getValue();
                Double value2 = o2.getValue();
                return (value1 > value2) ? 1 : (value1 == value2) ? 0 : -1;
            }
        });
        System.out.println("sorted by value");
        for (Map.Entry<Food, Double> entry : entries) {
            System.out.print("" + entry.getKey() + " " + entry.getValue());
        }
    }
}

