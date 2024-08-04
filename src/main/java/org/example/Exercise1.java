package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise1 {
    // Method to determine the grade based on the best score
    public static char getGrade(double score, double bestScore) {
        if (score >= bestScore - 10) return 'A';
        if (score >= bestScore - 20) return 'B';
        if (score >= bestScore - 30) return 'C';
        if (score >= bestScore - 40) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.print("Enter the total number of students: ");
        int numStudents = scanner.nextInt();

        // Input validation
        if (numStudents <= 0) {
            System.out.println("The number of students should be greater than 0.");
            scanner.close();
            return;
        }

        double[] scores = new double[numStudents];

        // Collect scores from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
                System.out.print("Enter score for student " + (i + 1) + ": ");
            }
            scores[i] = scanner.nextDouble();
            // Validate score is non-negative
            while (scores[i] < 0) {
                System.out.println("Score should be a non-negative number. Please enter again.");
                System.out.print("Enter score for student " + (i + 1) + ": ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // Clear invalid input
                    System.out.print("Enter score for student " + (i + 1) + ": ");
                }
                scores[i] = scanner.nextDouble();
            }
        }

        // Determine the best score
        double bestScore = scores[0];
        for (double score : scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }

        // Display the student grades
        System.out.println("\nGrades:");
        for (int i = 0; i < numStudents; i++) {
            char grade = getGrade(scores[i], bestScore);
            System.out.println("Student " + (i + 1) + ": " + grade);
        }

        scanner.close();
    }
}
