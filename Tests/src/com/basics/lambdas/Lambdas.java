package com.basics.lambdas;

public class Lambdas {

    private static IAddable<String> stringAdder = (a, b) -> {
        return String.format("The result is: " + a + b);
    };

    private static IAddable<String> leghtOrder = (a, b) -> {
        if (a.length() > b.length()) {
            return String.format("The result is: " + a + b);
        } else {
            return String.format("The result is: " + b + a);
        }
    };

    private static void applyBehaviour(IAddable addable, String s1, String s2) {
        System.out.println(addable.add(s1, s2));
    }

    public static void main(String[] args) {

        String s1 = "This is ";
        String s2 = "a test!!!";

        applyBehaviour(stringAdder, s1, s2);
        applyBehaviour(leghtOrder, s1, s2);
    }
}
