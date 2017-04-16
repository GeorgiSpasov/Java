package com.basics;

import java.util.Arrays;

public class JavaTesting {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static <E> void printTwoArrays(E[] array1, E[] array2) {
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static void main(String[] args) {
        Integer integ[] = {1, 2, 3, 6, 2, 4};
        Character ch[] = {'a', 'd', 's', 'g', 'e'};

        printTwoArrays(integ, ch);

        Integer result = maximum(6, 3, 9);
        System.out.println(result);
    }
}
