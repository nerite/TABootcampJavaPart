package com.bootcampexcercise.module7.sample;

import java.util.Scanner;

public class AssertionSample2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        // assert that the absolute value is between 1-10
        assert (number > 0 && number <= 10) : "bad number: " + number;

        System.out.printf("You entered %d\n", number);
    } // end main
}