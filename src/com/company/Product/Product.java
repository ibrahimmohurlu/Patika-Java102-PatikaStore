package com.company.Product;

import com.company.Brand.Brand;

public abstract class Product {
    protected int id;
    protected Brand brand;
    protected double unitPrice;
    protected double discount;
    protected int stock;
    protected String name;

    public Product(int id, Brand brand, String name, double unitPrice, double discount, int stock) {
        this.id = id;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
