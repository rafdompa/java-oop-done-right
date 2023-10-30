package org.javaoop.solid;

public class ConsoleOutput implements Output {
    @Override
    public void display(String toDisplay) {
        System.out.println(toDisplay);
    }
}
