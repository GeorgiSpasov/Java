package remoteclock;

import java.io.Serializable;
import java.util.Calendar;

public class Time implements Serializable {

    private int timeZone;
    private int hour;
    private int minute;
    private int second;

    public Time(Time t) {
        this(t.getTimeZone(), t.getHour(), t.getMinute(), t.getSecond());
    }

    public Time() {
        this(0, 0, 0, 0);
    }

    public Time(int timeZone, int hour, int minute, int second) {
        this.setTimeZone(timeZone);
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public int getTimeZone() {
        return timeZone;
    }

    public final void setTimeZone(int timeZone) {
        this.timeZone = ((timeZone >= -12) && (timeZone <= 13)) ? timeZone : 0;
    }

    public int getHour() {
        return hour;
    }

    public final void setHour(int hour) {
        int hourCheck;

        if (hour >= 24) {
            hourCheck = hour % 24;
        } else {
            hourCheck = hour < 0 ? 0 : hour;
        }

        int tempHour = hourCheck + getTimeZone();
        if (tempHour < 0) {
            tempHour += 24;
        }
        if (tempHour >= 24) {
            tempHour -= 24;
        }
        this.hour = tempHour;
    }

    public int getMinute() {
        return minute;
    }

    public final void setMinute(int minute) {
        if (minute >= 60) {
            this.minute = minute % 60;
            setHour(getHour() + minute / 60);
        } else {
            this.minute = minute < 0 ? 0 : minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public final void setSecond(int second) {
        if (second >= 60) {
            this.second = second % 60;
            setMinute(getMinute() + second / 60);
        } else {
            this.second = second < 0 ? 0 : second;
        }
    }

    public void setTime(Time t) {
        setTimeZone(t.getTimeZone());
        setHour(t.getHour());
        setMinute(t.getMinute());
        setSecond(t.getSecond());
    }

    public Time getTime() {
        return this;
    }

    public void setCurrentTime() {
        setHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        setMinute(Calendar.getInstance().get(Calendar.MINUTE));
        setSecond(Calendar.getInstance().get(Calendar.SECOND));
    }

    public void tickSecond() {
        setSecond(getSecond() + 1);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d TZ:%+02d",
                getHour(),
                getMinute(),
                getSecond(),
                getTimeZone());
    }

}
