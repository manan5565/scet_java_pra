public class passObjToMethod {
    public static void main(String[] args) {
        Obj obj = new Obj(100, 22);
        Obj obj1 = new Obj(100, 22);
        Obj obj2 = new Obj(5, 5);

        System.out.println("Obj == Obj1 " + obj.equals(obj1));
        System.out.println("Obj1 == Obj2 " + obj1.equals(obj2));
    }
}

class Obj {
    int a, b;

    Obj(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Obj o) {
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}
