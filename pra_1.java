// Write a program which takes two numbers and an operator from the user and performs 
// mathematical operation on entered two numbers.
// Author :- Manan Koyawala

import java.util.*;

public class pra_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Num 1 :");
        int n1 = s.nextInt();
        System.out.println("Enter Num 2 :");
        int n2 = s.nextInt();
        System.out.println("Enter Num operator :");
        String operator = s.next();

        switch (operator) {
            case "+":
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 + n2));
                break;
            case "-":
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 - n2));
                break;
            case "/":
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 / n2));
                break;
            case "*":
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 * n2));
                break;
            case "%":
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 % n2));
                break;
            default:
                System.out.println("Invalid Operator " + operator);
        }
        s.close();
    }
}
