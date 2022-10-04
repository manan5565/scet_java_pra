// Demonstrate the static data field and static method by creating an appropriate class. Demonstrate this class in the main method by creating different objects.

public class pra_10 {
    static int n = 10;
    int n1 = 15;

    static void staticMethod() {
        System.out.println("static n = " + n);
    }

    void normalMethod() {
        System.out.println("n1 = " + n1);
    }

    public static void main(String[] args) {

        pra_10 m = new pra_10();
        System.out.println("Normal Method is called :-");
        m.normalMethod();

        System.out.println("Static Method is called :-");
        pra_10.staticMethod();
    }
}
