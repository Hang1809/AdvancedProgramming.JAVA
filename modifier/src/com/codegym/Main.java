package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.5, "blue");
        ExtendsCircle myCircle2 = new ExtendsCircle(2, "red");
        myCircle2.getColor();
        myCircle.getRadius();
    }
}
