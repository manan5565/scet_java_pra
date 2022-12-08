import java.util.Scanner;

//Write a simple java application that creates an interface Shape. The interface declares read() and show() methods and PI as constant data member. Create classes Rectangle and Circle that implement a Shape interface. Assume suitable data and member methods.
public class pra_14 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.show();
        Circle c = new Circle();
        c.read();
        c.show();
    }
}

class Rectangle implements Shape {
    int height;
    int length;

    @Override
    public void read() {
        System.out.println("Enter Height and Length:-");
        System.out.print("Height:");
        this.height = s.nextInt();
        System.out.print("Length:");
        this.length = s.nextInt();
    }

    @Override
    public void show() {
        System.out.println(
                "Area of Rectangle of Length: " + length + "and Height: " + height + " is " + (length * height));
    }
}

class Circle implements Shape {
    int r;

    @Override
    public void read() { // double radius, double height, double length
        System.out.print("Enter Radius:");
        this.r = s.nextInt();
    }

    @Override
    public void show() {
        System.out.println("Area of Circle A(" + r + ") = " + (PI * r * r));
    }
}

interface Shape {
    final double PI = 3.14;

    void read();

    void show();

    Scanner s = new Scanner(System.in);
}