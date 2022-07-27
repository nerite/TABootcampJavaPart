package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double a;
    private double b;
    private double c;

    public double calculateArea(double a, double b, double c) {
        this.a = a;
        this.b = b; // rectangle area length
        this.c = c;  // rectangle area width
        return a = b * c;
    }

    public double calculatePerimeter(double a, double b, double c) {
        this.a = a;
        this.b = b; // rectangle perimeter length
        this.c = c; // rectangle perimeter width
        return a = ((b + c) * 2);
    }
}
