//Write a simple java application that creates a Shape class with two double data members. The class should have one abstract method area to calculate the area of shape. Inherit two classes Rectangle and Triangle from Shape class. Demonstrate runtime polymorphism.
public class pra_13 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area(10, 10);
        Traingle t = new Traingle();
        t.area(15, 15);
    }
}

abstract class Shape {
    double length;
    double height;

    abstract void area(double l, double h);
}

class Rectangle extends Shape {
    @Override
    void area(double l, double h) {
        length = l;
        height = h;
        System.out.println("Area of Rectangle is " + length + " * " + height + " = " + (length * height));
    }
}

class Traingle extends Shape {
    @Override
    void area(double l, double h) {
        length = l;
        height = h;
        System.out
                .println("Area of Traingle is l = " + length + " h = " + height + " Ans = " + ((length * height) / 2));
    }
}