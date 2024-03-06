/*1. Take 10 integer inputs from user and store them in an array and print them on screen.
*/

import java.util.Scanner;
public class Problem01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered the following numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}