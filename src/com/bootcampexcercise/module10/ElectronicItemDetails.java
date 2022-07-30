package com.bootcampexcercise.module10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElectronicItemDetails {

    static Map<String, Double> itemHashMap;

    public double returnPriceOfItem(Map map, String name) {
        Double price = (Double) map.get(name);
        return price;
    }

    public static void main(String[] args) {

        ElectronicItemDetails obj = new ElectronicItemDetails();

        itemHashMap = new HashMap<String, Double>();

        itemHashMap.put("TV", 479.0);
        itemHashMap.put("Refrigerator", 655.0);
        itemHashMap.put("Washing Machine", 349.0);
        itemHashMap.put("Laptop", 1589.99);

        System.out.println("Price of TV is " + itemHashMap.get("TV"));

        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap,"TV"));

    }

}

