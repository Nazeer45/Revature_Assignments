/*3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
*/

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int positives = 0, negatives = 0, odds = 0, evens = 0, zeros = 0;

        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] > 0) {
                positives++;
            } else if (numbers[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }

            if (numbers[i] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        System.out.println("Number of positive numbers: " + positives);
        System.out.println("Number of negative numbers: " + negatives);
        System.out.println("Number of odd numbers: " + odds);
        System.out.println("Number of even numbers: " + evens);
        System.out.println("Number of 0s: " + zeros);

        scanner.close();
    }
}
