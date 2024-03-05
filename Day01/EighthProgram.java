/* 8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.*/

import java.util.Scanner;
public class EighthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int first;
        int secondLast;
        int sum;

        System.out.println("Enter a 5 digit number:");
        number = input.nextInt();

        input.close();

        first = number / 10000;
        secondLast = (number / 10) % 10;

        sum = first + secondLast;

        System.out.println("The sum of the first and the second last digit is: " + sum);
    }
}
