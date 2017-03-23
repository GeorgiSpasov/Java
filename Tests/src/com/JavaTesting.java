package com;

import java.util.Scanner;

public class JavaTesting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = input.nextDouble();
        System.out.printf("Square result: %f.\t", Math.pow(num, 2));
    }
}
