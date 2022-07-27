package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double a;
    private double b;
    private double c;

    public double calculateArea(double a, double length, double width) {
        this.a = a;
        this.b = length; // rectangle area length
        this.c = width;  // rectangle area width
        return a = length * width;
    }

    public double calculatePerimeter(double a, double length, double width) {
        this.a = a;
        this.b = length; // rectangle perimeter length
        this.c = width; // rectangle perimeter width
        return a = ((length + width) * 2);
    }
}
