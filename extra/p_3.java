package extra;

// Author :- Manan Koyawala
// 1.3 - Write a program to find the distance that the light travels in 4520 days.
public class p_3 {
    public static void main(String[] args) {

        int days = 4520;
        double seconds = days * 24 * 60 * 60;
        double speed = 186000;
        double distance = seconds * speed;
        System.out.println("Light travels in " + days + " days is Distance = " + distance);
    }
}
