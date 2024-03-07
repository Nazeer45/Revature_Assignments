/*2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
*/

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length >= 2) {
            char firstInitial = nameParts[0].charAt(0);

            char middleInitial = nameParts[1].charAt(0);

            System.out.print("Abbreviation: " + firstInitial);
            if (nameParts.length > 2) {
                System.out.print("." + middleInitial);
            }
            System.out.println("." + nameParts[nameParts.length - 1]);
        } else {
            System.out.println("Invalid input. Please provide a full name.");
        }

        scanner.close();
    }
}
