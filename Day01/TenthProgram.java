/* 10. Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner.*/
import java.util.Scanner;
public class TenthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int reversed;
        int digit1, digit2, digit3;

        System.out.println("Enter a 3-digit number:");
        number = input.nextInt();

        input.close();

        digit1 = number / 100;
        digit2 = (number / 10) % 10;
        digit3 = number % 10;

        reversed = digit3 * 100 + digit2 * 10 + digit1;

        System.out.println("The reversed number is: " + reversed);
    }
}
