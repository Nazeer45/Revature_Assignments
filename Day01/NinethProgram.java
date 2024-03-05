/* 9. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.*/
import java.util.Scanner;
public class NinethProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int digit1, digit2, digit3;
        int sum;

        System.out.println("Enter a 3-digit number:");
        number = input.nextInt();

        input.close();

        digit1 = number / 100;
        digit2 = (number / 10) % 10;
        digit3 = number % 10;

        sum = digit1 + digit2 + digit3;

        System.out.println("The sum of the digits is: " + sum);
    }
}
