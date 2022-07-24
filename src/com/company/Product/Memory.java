package com.company.Product;

public enum Memory {
    GB128(128),
    GB64(64),
    GB512(512),
    GB8(8);
    private final int value;

    Memory(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
