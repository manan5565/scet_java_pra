public class throwsDemo {
    static void callme() throws IllegalAccessException {
        System.out.println("Inside callme.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            callme();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }

}
