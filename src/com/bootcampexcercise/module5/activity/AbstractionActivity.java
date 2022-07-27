package com.bootcampexcercise.module5.activity;

public class AbstractionActivity {
    public static void main(String args[]) {

        Shape sr = new Rectangle();
        Shape sc = new Circle();
        // set and Print color of rectangle
        sr.setColor("Violet");
        System.out.println("Rectangle color is " + sr.getColor());

        // Give area of rectangle
        System.out.println("Rectangle area is " + sr.calculateArea(0,2,8));
        // Print perimeter of rectangle
        System.out.println("Rectangle perimeter is " + sr.calculatePerimeter(0,10,20));
        // set and Print color of circle
        sc.setColor("Black");
        System.out.println("Circle color is " + sc.getColor());
        // Give area of circle
        System.out.println("Circle area is " + sc.calculateArea(0,3.14,5));
        // Print perimeter of circle
        System.out.println("Circle perimeter is " + sc.calculatePerimeter(0,3.14,20));
    }
}
