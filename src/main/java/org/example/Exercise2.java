package org.example;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Read 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
            numbers[i] = scanner.nextInt();
        }

        // Display the integers in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}

