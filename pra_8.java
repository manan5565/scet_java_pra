// Write a simple java application that defines a class Complex with real(int) and img(int) as data fields, no-argument constructor and parameterized constructor.
// The class should have overloaded methods to perform addition of two Complex numbers by passing objects as arguments.
// Demonstrate this keyword in a parameterized constructor.
public class pra_8 {
    public static void main(String[] args) {
        Complex c = new Complex();
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(10, 5);

        c.addition(c1, c2);
        c.addition(c1, c2, 1);

    }
}

class Complex {
    int real;
    int img;

    Complex() { // default cons.

    }

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void addition(Complex c1, Complex c2) {
        Complex c = new Complex();
        c.real = c1.real + c2.real;
        c.img = c1.img + c2.img;
        System.out.println();
        System.out.println("2 Parameters Method Called :-");
        System.out.println("Addition of two Complex Number is:-");
        System.out.println("First Num :- " + c1.real + " + i" + c1.img);
        System.out.println("Second Num :- " + c2.real + " + i" + c2.img);
        System.out.println("Ans = " + c.real + " + i" + c.img);
    }

    public void addition(Complex c1, Complex c2, int i) {
        Complex c = new Complex();
        c.real = c1.real + c2.real;
        c.img = c1.img + c2.img;
        System.out.println();
        System.out.println("3 Parameters Method Called :-");
        System.out.println("Addition of two Complex Number is:-");
        System.out.println("First Num :- " + c1.real + " + i" + c1.img);
        System.out.println("Second Num :- " + c2.real + " + i" + c2.img);
        System.out.println("Ans = " + c.real + " +" + i + "(" + c.img + ") where i = " + i);
    }
}