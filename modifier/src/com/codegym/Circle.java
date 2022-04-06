package com.codegym;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    protected double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }
}
