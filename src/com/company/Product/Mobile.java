package com.company.Product;

import com.company.Brand.Brand;

public class Mobile extends Product {

    private Memory memory=Memory.GB8;
    private double screenSize = 6.1;
    private int battery = 4000;
    private Memory ram = Memory.GB8;
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

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String leftAlignFormat = "| %-2d | %-12s | %-8.2f TL | %-8s | %-8s GB | %-8.1f | %-5s GB |";
        return String.format(leftAlignFormat, this.id, this.name, this.unitPrice,
                this.brand.getName(), this.memory.getValue(), this.screenSize, this.ram.getValue());
    }
}
