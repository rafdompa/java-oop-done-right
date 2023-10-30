package org.javaoop.simplepointofsale.domain;

/**
 * Responsible to print POS objects
 *
 * DR: we'll use console to print
 */
public class Printer {
    public void print( String text){
        System.out.print(text);
    }

    public void newline(){
        System.out.println();
    }
}
