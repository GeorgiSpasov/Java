package com.basics;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputCheck(scanner);
    }

    public static void InputCheck(Scanner s) {
        System.out.print("Enter an intger: ");
        try {
            int i = s.nextInt();
            System.out.println("You have entered: " + i);
        } catch (Exception e) {
            System.out.println("You have netered an invalid number!");
            InputCheck(new Scanner(System.in));
        }
    }
}
