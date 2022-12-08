public class contructor {
    public static void main(String[] args) {
        cons c = new cons();
        System.out.println("Id = " + c.id + " Name = " + c.name);

        cons c1 = new cons(87, "Manan");
        System.out.println("Id = " + c1.id + " Name = " + c1.name);
    }
}

class cons {
    int id;
    String name;

    cons() {
        System.out.println("Defualt Constructor is Called");

    }

    cons(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor is Called");
    }
}