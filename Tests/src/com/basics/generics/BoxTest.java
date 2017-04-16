package com.basics.generics;

import java.util.Arrays;

public class BoxTest {

    public static void main(String[] args) {
        Integer[] intArr = {3, 4, 2, 6, 5};
        Double[] doubleArr = {5.2, 3.4, 6.1, 2.0};

        Box<Number> mainBox = new Box<>();
        mainBox.putContent(intArr);
        System.out.println(Arrays.asList(mainBox.getContent()));

        Box<Double> doubleBox = new Box<>(doubleArr);
        mainBox.putContent(doubleBox);
        System.out.println(Arrays.asList(mainBox.getContent()));
    }
}
