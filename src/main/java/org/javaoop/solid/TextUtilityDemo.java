package org.javaoop.solid;

public class TextUtilityDemo {
    public static void main(String[] args) {
        Input input = new KeyboardInput();
        Output output = new ConsoleOutput();

        new TextConversion(input, output).showInputInUpperCase();
    }
}
