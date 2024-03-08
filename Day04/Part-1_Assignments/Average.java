/*5. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
*/
import java.util.Scanner;

public class Average {
    public static void printAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        printAverage(num1, num2, num3);
        scanner.close();
    }
}
