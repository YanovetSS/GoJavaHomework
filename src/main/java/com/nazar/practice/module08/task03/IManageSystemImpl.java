package com.nazar.practice.module08.task03;

import com.nazar.practice.module08.task02.Food;

import java.util.*;

public class IManageSystemImpl implements IManageSystem<Food> {
    private Map<Food, Double> dataBase = new HashMap<>();

    private static final Double WHEN_NO_PRICE_ = 0.0D;

    @Override
    public Food save(Food obj, double price) {
        dataBase.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        dataBase.put(obj, WHEN_NO_PRICE_);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        dataBase.remove(obj);
        System.out.println(" - " + obj);
    }

    @Override
    public void deleteById(int id) {
        for (Map.Entry<Food, Double> entry : dataBase.entrySet()) {
            if (id == entry.getKey().getId()) {
                dataBase.remove(entry);
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
        dataBase = new TreeMap<Food, Double>(dataBase);
        TreeMap<Food,Double> dataBase1 = new TreeMap<Food, Double>(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        dataBase1.putAll(dataBase);
        System.out.println(dataBase1);

    }

    @Override
    public void printProductsSortedByPrice() {
        System.out.println("Print product sorted by Price(Value): ");
        dataBase = new TreeMap<Food, Double>(dataBase);
        List list = new ArrayList(dataBase.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Food,Double>>() {
            @Override
            public int compare(Map.Entry<Food,Double> o1, Map.Entry<Food,Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println(list);
    }
}
