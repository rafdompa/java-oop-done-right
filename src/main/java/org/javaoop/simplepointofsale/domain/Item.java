package org.javaoop.simplepointofsale.domain;

public class Item {
    private final Money price;
    private final String description;

    public Item(String description, Money price) {
        this.description = description;
        this.price = price;
    }

    public void print(Printer p){
//        p.print(description);
//        p.print(" ");
//        price.print(p);
//
//        p.newline();

        new ItemFormat(description, price).print(p);
    }
}
