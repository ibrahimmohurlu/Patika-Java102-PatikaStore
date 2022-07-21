package com.company.Product;

import com.company.Brand.Brand;

public class Mobile extends Product {

    private Memory memory;
    private double screensize = 6.1;
    private int battery = 4000;
    private String ram = "6MB";
    private Color color;

    public Mobile(int id, Brand brand, String name, double unitPrice, double discount, int stock) {
        super(id, brand, name, unitPrice, discount, stock);
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public double getScreensize() {
        return screensize;
    }

    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
