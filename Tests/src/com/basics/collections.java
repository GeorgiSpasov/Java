package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class collections {

    public static void main(String[] args) {
        Integer intArray[] = {3, 5, 2, 7, 8, 1};
        System.out.println(Arrays.toString(intArray));

        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

        ListIterator iter = intList.listIterator();
        System.out.println(intList.get(0));
        iter.next();
        iter.set(4);
        iter.next();
        iter.remove();
        iter.add(0);
//        intList.add(32); -> ConcurrentModificationException
        System.out.println(iter.next());
        System.out.println(intList);
        System.out.println(Arrays.toString(intArray));
    }
}
