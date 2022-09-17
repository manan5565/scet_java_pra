import java.util.*;

public class pra_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Password");
        String password = s.nextLine();

        if (password.length() >= 8 && !password.contains(" ")
                && (password.contains("$") || password.contains("#") || password.contains("%"))
                && password.chars().anyMatch(Character::isUpperCase)
                && password.chars().anyMatch(Character::isLowerCase)) {
            System.out.println("Password is Valid.");
        } else {
            System.out.println("Password is Invalid.");
        }

        s.close();
    }
}
