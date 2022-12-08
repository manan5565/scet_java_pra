package stringclass;

public class Strings {
    public static void main(String[] args) {
        // String nS = new String("Welcome Java");
        // System.out.println(nS);
        // nS = "Manan";
        // System.out.println(nS);

        // char[] charArray = {' M',' a',' n',' a', 'n'};
        // String message = new String(charArray);
        // System.out.println(message);''

        // System.out.println("JAVA".replace("A", "B"));
        // System.out.println("JAVA".replaceFirst("A", "Z"));

        // System.out.println("Java".equals("Java"));
        // System.out.println("Jav is Love".matches("Java.*"));
        // System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));

        // String[] arr = new String[] { "K", "R", "$", "N", "A" };
        // for (int i = 0; i < 5; i++) {
        // System.out.print(arr[i]);
        // }

        StringBuilder s = new StringBuilder();
        s.append("Java ");
        s.append("is ");
        s.append("Love.");
        System.out.println(s);
        s.delete(5, 7);
        System.out.println(s);
        s.deleteCharAt(5);
        System.out.println(s);
        s.replace(5, 7, "XY");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.setLength(5);
        System.out.print(s);
    }
}
