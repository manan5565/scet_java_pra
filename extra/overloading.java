public class overloading {
    public static void main(String[] args) {
        overload o = new overload();
        o.sum();
        o.sum(20.0, 10.0);
        o.sum(5, 6);
    }
}

class overload {
    void sum() {
        System.out.println("No Operation Performed");
    }

    void sum(int i, int j) {
        System.out.println("Integer Addition :- i = " + i + " + j = " + j);
    }

    void sum(double i, double j) {
        System.out.println("Double Addition :- i = " + i + " + j = " + j);
    }
}
