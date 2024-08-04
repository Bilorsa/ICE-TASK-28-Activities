package org.example;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        // Array to store counts for numbers 0 through 9
        int[] counts = new int[10];
        Random random = new Random();

        // Generate 100 random integers between 0 and 9 and count their occurrences
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10); // Generates a number between 0 (inclusive) and 10 (exclusive)
            counts[number]++;
        }

        // Display the counts for each number
        System.out.println("Number counts:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }

}
