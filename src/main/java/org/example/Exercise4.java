package org.example;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store up to 100 scores
        double[] scores = new double[100];
        int count = 0;

        System.out.println("Enter scores (enter a negative number to finish):");

        // Read scores from the user
        while (true) {
            double score = scanner.nextDouble();

            if (score < 0) {
                break;  // Exit the loop when a negative number is entered
            }

            if (count < 100) {
                scores[count] = score;
                count++;
            } else {
                System.out.println("Maximum number of scores (100) reached.");
                break;
            }
        }

        if (count == 0) {
            System.out.println("No scores were entered.");
            scanner.close();
            return;
        }

        // Calculate the average score
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        double average = sum / count;

        // Determine how many scores are above or equal to the average
        // and how many are below the average
        int aboveOrEqualCount = 0;
        int belowCount = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqualCount++;
            } else {
                belowCount++;
            }
        }

        // Display results
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores below the average: " + belowCount);

        scanner.close();
    }
}



