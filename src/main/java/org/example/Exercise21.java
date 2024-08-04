package org.example;
import java.util.Scanner;

public class Exercise21 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter list1: ");
            int size = input.nextInt();

            int[] list1 = new int[size];
            for (int i = 0; i < size; i++) list1[i] = input.nextInt(); // save input to array

            System.out.print("Enter list2: ");
            size = input.nextInt();

            int[] list2 = new int[size];
            for (int i = 0; i < size; i++) list2[i] = input.nextInt(); // save input to array

            if (equals(list1, list2)) {
                System.out.println("Two lists are strictly identical");
            } else {
                System.out.println("Two lists are not strictly identical");
            }



        }

        public static boolean equals(int[] list1, int[] list2) {

            if (list1.length != list2.length) return false;


            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) return false;
            }

            return true;
        }
    }