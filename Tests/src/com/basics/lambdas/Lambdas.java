package com.basics.lambdas;

import java.util.Arrays;

public class Lambdas {

    public static IAddable<String> stringAdder = new IAddable<String>() {

        @Override
        public String add(String t1, String t2) {
            return String.format(t1 + t2);
        }
    };

    public static IAddable<String> leghtOrder = (a, b) -> {
        if (a.length() > b.length()) {
            return String.format(a + b);
        } else {
            return String.format(b + a);
        }
    };

    private static void applyBehaviour(IAddable addable, String s1, String s2) {
        System.out.println(addable.add(s1, s2));
    }

    public static void main(String[] args) {
        System.out.println(stringAdder.add("hi ", "there"));

        String s1 = "this is ";
        String s2 = "a new test ";
        applyBehaviour(stringAdder, s1, s2);
        applyBehaviour(leghtOrder, s1, s2);

        int intArray[] = {5, 3, 4, 7, 2, 6};
        Arrays.stream(intArray)
                .filter(i -> i > 4)
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
