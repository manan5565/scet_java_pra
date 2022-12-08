//Write a simple java application that creates a Shape class with two double data members. The class should have an area method to calculate the area of shape. Inherit two classes Rectangle and Triangle from Shape class. Demonstrate method overriding & super keyword.//
public class pra_12 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.showArea(10, 15);
        Rectangle r = new Rectangle();
        r.showArea(15, 10);
        Triangle t = new Triangle();
        t.showArea(10, 15);
    }
}

class Shape {
    double length;
    double height;

    Shape() {
        System.out.println("Shape Class Constructor Called");
    }

    void showArea(double l, double h) {
        System.out.println("No Area is Printed");
    }
}

class Rectangle extends Shape {
    Rectangle() {
        super();
    }

    @Override
    void showArea(double l, double h) {
        this.length = l;
        this.height = h;
        System.out.println("Area of Rectangle is " + length + " * " + height + " = " + (length * height));
    }
}

class Triangle extends Shape {
    Triangle() {
        super();
    }

    @Override
    void showArea(double l, double h) {
        this.length = l;
        this.height = h;
        System.out.println("Area of Traingle l = " + length + " h = " + height + " = " + ((length * height) / 2));
    }
}
