package com.basics.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static oracle.jrockit.jfr.JFR.get;

public class Streams {

    public static void main(String[] args) {
        // Array Stream
        int intArr[] = {32, 43, 12, 11, 67, 54};
        System.out.println(Arrays.toString(intArr));
        int mappedArr[] = IntStream.of(intArr)
                .boxed() // Boxing int into Integer
                .filter(i -> i > 40)
                .map(i -> i * 10)
                .sorted((a, b) -> b - a) // Not working with int
                .mapToInt(Integer::intValue) // Unboxing
                .toArray();
        System.out.println(Arrays.toString(mappedArr));

        // List Stream
        Stream<Integer> intStream = Stream.of(4, 3, 7, 6, 2, 9, 1);
        List<Integer> intList = intStream
                .filter(a -> a > 5)
                .sorted((a, b) -> b - a)
                .map(i -> i + 10)
                .collect(Collectors.toList());
        System.out.println(intList);

        Stream.of()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
