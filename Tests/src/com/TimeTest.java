package com;

public class TimeTest {

    public static void main(String[] args) {
        Time time = new Time(12, 30, 45);
        Time time2 = new Time(time);
        Time time3 = new Time(); // Autoincrement static field 'id'
        Time time4 = new Time();
        time4 = null;
        System.gc();
        System.out.println(time4);
        Time time5 = new Time();
        System.out.println(Time.getCounter());
        System.out.println(time.getId());

        time2.setHour(22);
//        System.out.println(time);
//        System.out.println(time2);
    }
}
