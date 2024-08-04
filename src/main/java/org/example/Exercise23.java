package org.example;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) numbers[i] = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {

            for (int k = 0; k < numbers.length; k++) {
                if (k != i) {
                    System.out.print(numbers[i] + "-" + numbers[k] + " ");
                }
            }
            System.out.println("");
        }
    }
}

