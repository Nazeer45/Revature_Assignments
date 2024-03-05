/* 6. Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/

import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Enter the temperature in Fahrenheit:");
        fahrenheit = input.nextDouble();

        input.close();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celsius is: " + celsius);
    }
}
