/* Design a class named Triangle to represent a Triangle. The class contains:
- Three double data fields named a, b and c specifying three sides of the triangle. The 
default values are 1.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified values.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter. */

// Author :- Manan Koyawala

import java.util.*;

public class pra_5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Three Numbers : ");
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();

        try {
            // Triangle t = new Triangle(); default sides
            Triangle t = new Triangle(n1, n2, n3); // user entered sides
            double area = t.getArea();
            String sides = t.getPerimeter();
            System.out.println("Area of Traingle is " + area);
            System.out.println(sides);
        } catch (Exception e) {
            e.printStackTrace();
        }
        s.close(); // close Scanner so not leak resource
    }

}

class Triangle {
    private double s1 = 1.0;
    private double s2 = 1.0;
    private double s3 = 1.0;

    public Triangle() {

    } // default cons.

    public Triangle(double s1, double s2, double s3) { // param con.
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getArea() {
        return (s1 + s2 + s3) / 2;
    }

    public String getPerimeter() {
        return "Side 1 : " + s1 + ", Side 2 : " + s2 + ", Side 3 : " + s3;
    }

}
