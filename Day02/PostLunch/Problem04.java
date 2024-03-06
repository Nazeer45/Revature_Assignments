/*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
*/

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.println("Original array:");
        for (int number : originalArray) {
            System.out.print(number + " ");
        }
        System.out.println("\nReversed array:");
        for (int number : reversedArray) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
