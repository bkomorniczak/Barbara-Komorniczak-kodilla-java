package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private final ArrayList<Shape> shapes = new ArrayList <>();

    public void addFigure(Shape shape){
       shapes.add(shape);

    }

    public boolean removeFigure(Shape shape){
       shapes.remove(shape);
        return true;
    }

    public Shape getFigure(int n){

        if(shapes.isEmpty()){
            System.out.println("No shapes in collection");
            return null;
        }else {
            return shapes.get(n);
        }

    }

    public void showFigures(){
        for(Shape s : shapes){
            System.out.println(s);
        }

    }
}
