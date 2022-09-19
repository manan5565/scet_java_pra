// Write a program to find the factorial of a given number. Take the number through the 
// command line argument.
// Author : Manan Koyawala

import java.util.*;

public class pra_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number to Count Factorial :");
        int num = s.nextInt();
        int factorail = 1;

        for (int i = 1; i <= num; i++) {
            factorail = factorail * i;
        }

        System.out.println("Factorail of " + num + " is " + factorail);
        s.close();
    }
}
