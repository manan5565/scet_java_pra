import java.util.Scanner;

//Write a simple java application that declares Employee class. The program should generate and handle custom exceptions such as
//a. InvalidEmailAddressException if the address does not contain . and @
//b. InvalidTelephoneNumberException if total no of digits > 10.
public class pra_17 { // as Emplyee class
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Email Address : ");
        String email = s.next();
        System.out.print("Enter Telephone Number : ");
        String number = s.next();
        s.close();
        try {
            if (email.contains("@") && email.contains(".")) {
                System.out.println("Valid Email Address :- " + email);
            } else {
                throw new InvalidEmailAddressException();
            }
        } catch (InvalidEmailAddressException e) {
            System.out.println("Invalid Email it should contain @ and . ");
        }

        try {
            if (number.length() == 10) {
                System.out.println("Valid Telephone Number :- " + number);
            } else {
                throw new InvalidTelephoneNumberException();
            }
        } catch (InvalidTelephoneNumberException e) {
            System.out.println("Telephone Number exactly 10 Digits");
        }
    }
}

class InvalidEmailAddressException extends Exception {
    InvalidEmailAddressException() {
    }
}

class InvalidTelephoneNumberException extends Exception {
    InvalidTelephoneNumberException() {
    }
}