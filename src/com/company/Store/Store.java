package com.company.Store;

import com.company.Brand.Brand;
import com.company.Brand.Brands;
import com.company.Product.Mobile;
import com.company.Product.Notebook;
import com.sun.source.tree.Tree;

import java.util.TreeMap;
import java.util.TreeSet;

public class Store {
    private static TreeMap<Integer, Notebook> notebooks = new TreeMap<>();
    private static TreeMap<Integer, Mobile> mobiles = new TreeMap<>();

    static {
        notebooks.put(1, new Notebook(1, Brands.getBrandByName("Huawei"), "Matebook 14", 7000.0, 0, 3));
        notebooks.put(2, new Notebook(2, Brands.getBrandByName("Lenovo"), "V14 IGL", 3699.0, 0, 2));
        notebooks.put(3, new Notebook(3, Brands.getBrandByName("Asus"), "Tuf Gaming", 8199.0, 0, 1));

        mobiles.put(1, new Mobile(1, Brands.getBrandByName("Samsung"), "Galaxy A51", 3199.0, 0, 5));
        mobiles.put(2, new Mobile(2, Brands.getBrandByName("Apple"), "Iphone 11", 7379.0, 0, 2));
        mobiles.put(3, new Mobile(3, Brands.getBrandByName("Xiaomi"), "Note 10 Pro", 4012.0, 0, 8));
    }

    public Store() {

    }

    public void printNotebooks() {
        String line = "+--------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı     | Fiyat       | Marka    | Depolama    | Ekran    | RAM      |%n");
        System.out.format(line);
        notebooks.forEach((key, value) -> {
            System.out.println(value.toString());
        });
        System.out.format(line);
    }

    public void printMobiles(){
        String line = "+--------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı     | Fiyat       | Marka    | Depolama    | Ekran    | RAM      |%n");
        System.out.format(line);
        mobiles.forEach((key, value) -> {
            System.out.println(value.toString());
        });
        System.out.format(line);
    }

    public void printBrands() {
        Brands.printBrands();
    }
}
