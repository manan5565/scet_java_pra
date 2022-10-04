// Write a program to find the factorial of a given number. Take the number through the 
// command line argument.
// Author : Manan Koyawala

public class pra_4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int factorail = 1;

        for (int i = 1; i <= num; i++) {
            factorail = factorail * i;
        }

        System.out.println("Factorail of " + num + " is " + factorail);
    }
}
