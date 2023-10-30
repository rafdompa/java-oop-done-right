package org.javaoop.draw;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape s){
        shapes.add(s);
    }

    public void draw(){
        shapes.forEach(Shape::draw);
    }

    public void blur() {
        //this implementation will force us to continue making changes to this class
        // for every type of filter we'll need
        shapes.forEach(s -> s.apply(new BlurFilter()));
    }

    public void filter(Filter filter) { // better implementation using Strategy pattern
        shapes.forEach(s -> s.apply(filter));
    }
}
