package org.example;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store up to 10 numbers
        int[] numbers = new int[10];
        int count = 0; // Number of distinct numbers

        System.out.println("Enter 10 numbers:");

        // Read 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            // Check if the number is already in the array
            if (!contains(numbers, count, number)) {
                numbers[count] = number;
                count++;
            }
        }

        // Display the results
        System.out.println("Number of distinct numbers: " + count);
        System.out.print("Distinct numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }

    // Method to check if the number is already in the array
    public static boolean contains(int[] array, int size, int number) {
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}


