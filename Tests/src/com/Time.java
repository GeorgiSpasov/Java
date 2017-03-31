package com;

public class Time {

    private int hour;
    private int minute;
    private int second;
    private int id;
    private static int counter = 0;

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
        setId();
        System.out.println(this);
    }

    public Time(Time t) { // Reference to another obejct of the same class
        this(t.hour, t.getMinute(), t.getSecond()); // Access to private data "hour".
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = counter;
        ++counter;
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
                getId());
    }
}
