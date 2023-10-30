package org.javaoop.draw;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("I really like having three points");
    }

    @Override
    public void apply(Filter f) {

    }
}
