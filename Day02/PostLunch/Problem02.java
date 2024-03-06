/*2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
*/
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to check if it's in the array:");
        int toCheck = scanner.nextInt();

        boolean found = false;
        for (int num : numbers) {
            if (num == toCheck) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(toCheck + " is present in the array.");
        } else {
            System.out.println(toCheck + " is not present in the array.");
        }

        scanner.close();
    }
}
