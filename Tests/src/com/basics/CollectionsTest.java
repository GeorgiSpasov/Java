package com.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {
//        Integer intArray[] = {3, 5, 2, 7, 8, 1};
//        System.out.println(Arrays.toString(intArray));
//
//        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
//
//        ListIterator iter = intList.listIterator();
//        System.out.println(intList.get(0));
//        iter.next();
//        iter.set(4);
//        iter.next();
//        iter.remove();
//        iter.add(0);
////        intList.add(32); -> ConcurrentModificationException
//        System.out.println(iter.next());
//        System.out.println(intList);
//        System.out.println(Arrays.toString(intArray));

        String[] towns = {"Sofia", "Plovdiv", "Varna", "Dobrich", "Silistra"};

        System.out.println(String.join("|", towns));
        List<String> list = Arrays.asList(towns);
        Collections.sort(list, (a, b) -> b.compareTo(a));
        System.out.println(list);
        System.out.println(String.join(" | ", towns));
    }
}
