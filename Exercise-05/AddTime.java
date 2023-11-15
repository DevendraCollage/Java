// todo: Define Time class with constructor to initialize hour and minute. Also define addition method to add two time objects.
class Time {
    // todo: Two Property of the Time Class
    int minute;
    int hour;

    Time(int hour, int minute) { // todo: This is constructor of Time Class
        this.minute = minute;
        this.hour = hour;
    }

    public Time addTime(Time time) { // todo: This is addTime Method to add the time
        int newMinute = this.minute + time.minute;
        int newHour = this.hour + time.hour + newMinute / 60;
        newMinute %= 60;
        return new Time(newHour, newMinute);
    }

    public String toString() {
        return hour + ":" + minute;
    }
}

public class AddTime {
    public static void main(String[] args) {
        Time t1 = new Time(2, 36);
        Time t2 = new Time(5, 36);
        Time result = t1.addTime(t2);
        System.out.println("The New Time Is : " + result);
    }
}
