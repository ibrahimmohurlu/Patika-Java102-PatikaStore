package com.company.Product;

import com.company.Brand.Brand;

public class Notebook extends Product implements Comparable<Notebook> {
    private Memory ram = Memory.GB8;
    private Memory memory=Memory.GB512;
    private double screenSize = 14.0;

    public Notebook(int id, Brand brand, String name, double unitPrice, double discount, int stock) {
        super(id, brand, name, unitPrice, discount, stock);
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
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


    @Override
    public int compareTo(Notebook o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        String leftAlignFormat = "| %-2d | %-12s | %-8.2f TL | %-8s | %-8s GB | %-8.1f | %-5s GB |";
        return String.format(leftAlignFormat, this.id, this.name, this.unitPrice,
                this.brand.getName(), this.memory.getValue(), this.screenSize, this.ram.getValue());
    }
}
