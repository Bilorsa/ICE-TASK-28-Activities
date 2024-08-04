package org.example;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] userValues = new double[10];

        // Prompt user to enter 10 double values
        System.out.println("Enter 10 double values:");

        for (int i = 0; i < userValues.length; i++) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid double value.");
                scanner.next(); // Clear invalid input
            }
            userValues[i] = scanner.nextDouble();
        }

        // Find the index of the smallest value using the indexOfSmallestElement method
        int minIndex = ArrayUtils.indexOfSmallestElement(userValues);

        // Display the index of the smallest value
        System.out.println("The index of the smallest value is: " + minIndex);

        scanner.close();
    }
}

