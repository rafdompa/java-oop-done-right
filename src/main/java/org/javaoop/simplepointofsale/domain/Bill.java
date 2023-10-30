package org.javaoop.simplepointofsale.domain;

public class Bill {
    private float total;

    public float getTotal() {
        return total;
    }

    public void add(float itemPrice) {
        total += itemPrice;
    }
}
