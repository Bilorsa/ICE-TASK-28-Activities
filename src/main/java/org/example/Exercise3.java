package org.example;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store counts of numbers from 1 to 100
        int[] counts = new int[101];  // Index 0 will not be used

        System.out.println("Enter integers between 1 and 100 (enter 0 to finish):");

        // Read integers and count occurrences
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;  // Exit the loop when 0 is entered
            }

            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Number out of range. Please enter a number between 1 and 100.");
            }
        }

        // Display the counts
        System.out.println("Occurrences of numbers:");

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                if (counts[i] == 1) {
                    System.out.println(i + " occurs " + counts[i] + " time.");
                } else {
                    System.out.println(i + " occurs " + counts[i] + " times.");
                }
            }
        }

        scanner.close();
    }
}

