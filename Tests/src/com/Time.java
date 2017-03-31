package com;

public class Time {

    private int hour;
    private int minute;
    private int second;
    private final int ID;
    private static int counter;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
        this.ID = counter++;
        System.out.println(this);
    }

    public Time(Time t) { // Reference to another obejct of the same class
        this(t.hour, t.getMinute(), t.getSecond()); // Access to private data "hour".
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = ((hour >= 0 && hour < 24) ? hour : 0);
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = ((minute >= 0 && minute < 60) ? minute : 0);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = ((second >= 0 && second < 60) ? second : 0);
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    protected void finalize() {
        --counter;
    }

    @Override
    public String toString() {
        return String.format("Hour: %d; minute: %d; second: %d; id: %d",
                getHour(),
                getMinute(),
                getSecond(),
                getID());
    }
}
