package com.basics.lambdas;

public class Lambdas {

    public static IAddable<String> stringAdder = (a, b) -> a + b;

    public static String addStrings(String s1, String s2) {
        return String.format("Concatenated Result: "
                + stringAdder.add(s1, s2));
    }

    public static void main(String[] args) {

        String s1 = "This is ";
        String s2 = "a test!";

        String result = addStrings(s1, s2);
        System.out.println(result);
    }
}
