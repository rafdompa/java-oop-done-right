package org.javaoop.solid;

import java.util.Scanner;

public class TextConversion {
    private Input input;
    private Output output;


    public TextConversion(final Input input, final Output output) {
        this.input = input;
        this.output = output;
    }

    public void showInputInUpperCase(){
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        String upperCaseText = inputText.toUpperCase();

        System.out.println(upperCaseText);
    }

    public void showInputInUpperCaseInverted(){
        String inputText = input.fetch();

        String upperCaseText = inputText.toUpperCase();

        output.display(upperCaseText);
    }
}
