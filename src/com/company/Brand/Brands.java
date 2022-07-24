package com.company.Brand;

import java.util.TreeMap;
import java.util.TreeSet;

public class Brands {
    private static TreeMap<Integer, Brand> brandsData = new TreeMap<>();

    static {
        brandsData.put(1, new Brand(1, "Samsung"));
        brandsData.put(2, new Brand(2, "Lenovo"));
        brandsData.put(3, new Brand(3, "Apple"));
        brandsData.put(4, new Brand(4, "Huawei"));
        brandsData.put(5, new Brand(5, "Casper"));
        brandsData.put(6, new Brand(6, "Asus"));
        brandsData.put(7, new Brand(7, "HP"));
        brandsData.put(8, new Brand(8, "Xiaomi"));
        brandsData.put(9, new Brand(9, "Monster"));
    }

    public static void printBrands() {
        for (Integer key : brandsData.keySet()) {
            System.out.println(key + "-" + brandsData.get(key).getName());
        }
    }

    public static Brand getBrandById(int id) {
        if (brandsData.keySet().contains(id)) {
            return brandsData.get(id);
        }
        return null;
    }

    public static Brand getBrandByName(String name) {
        for (Integer key : brandsData.keySet()) {
            if (brandsData.get(key).getName().equals(name)) {
                return brandsData.get(key);
            }
        }
        return null;
    }
}
