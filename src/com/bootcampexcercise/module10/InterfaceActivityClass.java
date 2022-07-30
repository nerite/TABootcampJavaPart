package com.bootcampexcercise.module10;

public class InterfaceActivityClass {

    public static void main(String[] args) {

        Bike b = new Bike();
        Car c = new Car();

        b.start();
        b.stop();

        c.start();
        c.stop();
    }
}
