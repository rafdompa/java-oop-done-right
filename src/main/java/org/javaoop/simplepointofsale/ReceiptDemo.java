package org.javaoop.simplepointofsale;

import org.javaoop.simplepointofsale.domain.Money;
import org.javaoop.simplepointofsale.domain.Printer;
import org.javaoop.simplepointofsale.domain.Receipt;

class ReceiptDemo {
    public static void main(String[] args) {
        new ReceiptDemo().run();
    }

    private void run() {
        Receipt r = new Receipt(new Printer());

        //nice cheese and wine evening
        r.add("Brie", new Money("1.95", "GBP"));
        r.add("Tiger Bread", new Money("0.95", "GBP"));
        r.add("Merlot", new Money("7.95", "GBP"));

        r.print();
    }
}
