/*2. Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.
*/

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] marks = new int[8][3];

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        double[] averages = new double[8];
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            averages[i] = sum / 3.0;
        }

        System.out.println("Roll Number\tAverage Marks");
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + "\t\t" + averages[i]);
        }

        scanner.close();
    }
}
