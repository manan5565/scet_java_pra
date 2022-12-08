public class ThrowDemo {
    static void callme() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside callme.");
            throw e; // rethrow the exception
        }
    }

    public static void main(String args[]) {
        try {
            callme();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }

}
