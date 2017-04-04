package com.basics.constructors;

import static com.basics.constructors.Time.getCounter;

public class TimeTest {

    public static void main(String[] args) {
        Time time1 = new Time(12, 30, 45);
        Time time2 = new Time(22, 00, 15);
        Time time3 = new Time(time2); // Autoincrement static field 'id'
        Time time4 = new Time();
        Time time5 = new Time();
        time4 = null;
        time5 = null;
        System.gc();
        Runtime.getRuntime().runFinalization();
        System.out.println("Compare result: " + time1.compareTo(time2));
        System.out.println(time4);
        System.out.println(getCounter());
        System.out.println(time1.getID());
        System.out.println(time1.getCounter());

        time2.setHour(22);
//        System.out.println(time);
//        System.out.println(time2);
    }
}
