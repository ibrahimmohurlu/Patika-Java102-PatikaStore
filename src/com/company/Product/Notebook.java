package com.company.Product;

import com.company.Brand.Brand;

public class Notebook extends Product {
    private String ram = "8GB";
    private Memory memory;
    private double screenSize = 14.0;

    public Notebook(int id, Brand brand, String name, double unitPrice, double discount, int stock) {
        super(id, brand, name, unitPrice, discount, stock);
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
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
}
