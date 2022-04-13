package com.codegym;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all sides");
    }
}
