package com.bootcampexcercise.module5.activity;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double a;
    private double b;
    private double c;

    public double calculateArea(double a, double pi, double radius) {
        this.a = a;
        this.b = pi; // circle area pi
        this.c = radius; // circle area radius
        return a = (pi * radius * radius);
    }

    public double calculatePerimeter(double a, double pi, double diameter) {
        this.a = a;
        this.b = pi; // circle perimeter pi
        this.c = diameter; // circle perimeter diameter
        return a = (pi * diameter);
    }
}
