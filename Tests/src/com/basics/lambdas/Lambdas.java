package com.basics.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    public static void applyBehaviour(IAddable addable, String s1, String s2) {
        System.out.println(addable.add(s1, s2));
    }

    public static void main(String[] args) {
        System.out.println(stringAdder.add("hi ", "there"));

        // Decouple functionality from method implementation
        String s1 = "this is ";
        String s2 = "a new test ";
        applyBehaviour(stringAdder, s1, s2);
        applyBehaviour(leghtOrder, s1, s2);

        // Use Predicate to sort and BinaryOperator to sum
        Integer intArray[] = {5, 3, 4, 7, 2, 6};
        List<Integer> r = Arrays.stream(intArray)
                .filter(i -> i > 4)
                .sorted()
                .map(i -> i + 10)
                .collect(Collectors.toList());

        // Convert Celsius list to Fahrenheit
        Function<List<Integer>, List<Double>> convertCelsius
                = i -> i.stream()
                        .map(x -> (x * 9.0 / 5 + 32))
                        .collect(Collectors.toList());

        List<Double> fTemps = convertCelsius.apply(r);

        System.out.println(r);
        System.out.println(fTemps);
    }
}
