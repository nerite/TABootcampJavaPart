package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double a;
    private double b;
    private double c;

    public double calculateArea(double a, double b, double c) {
        this.a = a;
        this.b = b; // rectangle length
        this.c = c;  // rectangle width
        return a = b * c;
    }

    public double calculatePerimeter(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        return a = ((b + c) * 2);
    }
}
