
// Write a program that sorts the integer numbers taken from the user as an input.
// Author :- Manan Koyawala
import java.util.*;

public class pra_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, temp;
        int numbers[] = new int[30];

        System.out.println("Enter Length of Element:");
        n = s.nextInt();
        System.out.println("Enter Elements for sorting:");
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("----- Sorted Elements are -----");
        for (int j = 0; j < n; j++) {
            System.out.println(numbers[j]);
        }
        s.close();

    }
}
