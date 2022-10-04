import java.util.Scanner;

public class pra_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Hour");
        int hour = s.nextInt();
        System.out.println("Enter Minute");
        int minute = s.nextInt();

        Time t = new Time();
        Time t1 = new Time();
        Time t2 = new Time();

        t.getTime(hour, minute);

        System.out.println(t.showTime());

        t1.getTime(20, 7);
        t2.getTime(20, 6);

        t.add(t1, t2);
        t.ahead(t1, t2);
        s.close();
    }
}

class Time {
    private int hour;
    private int minute;

    Time() { // defualt con.

    }

    public void getTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void add(Time t1, Time t2) {
        System.out.println("Entered two Objects are :-");
        System.out.println("T1 Hour = " + t1.hour + " and T1 Minute " + t1.minute);
        System.out.println("T2 Hour = " + t2.hour + " and T2 Minute " + t2.minute);
        hour = t1.hour + t2.hour;
        minute = t1.minute + t2.minute;
        System.out.println("Addition of two Objects are " + hour + " Hours and " + minute + " Minutes");
    }

    public void ahead(Time t1, Time t2) {
        if (t1.hour > t2.hour) {
            System.out.println(t1.hour + " is ahead " + t2.hour);
        } else if (t1.hour == t2.hour) {
            if (t1.minute > t2.minute) {
                System.out.println(t1.hour + ":" + t1.minute + " is ahead " + t2.hour + ":" + t2.minute);
            } else {
                System.out.println(t2.hour + ":" + t2.minute + " is ahead " + t1.hour + ":" + t1.minute);
            }
        } else {
            System.out.println(t2.hour + " is ahead " + t1.hour);
        }
    }

    public String showTime() {
        return "Entered Hour is " + hour + " and Minute " + minute;
    }

}
