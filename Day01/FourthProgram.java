/* 4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.
*/
import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks1, marks2, marks3;
        int total;
        double percentage;

        System.out.println("Enter the marks of Robert in three subjects (out of 100):");
        marks1 = input.nextInt();
        marks2 = input.nextInt();
        marks3 = input.nextInt();
        input.close();

        total = marks1 + marks2 + marks3;
        percentage = (total / 300.0) * 100;

        System.out.println("The total marks of Robert are: " + total);
        System.out.println("The percentage marks of Robert are: " + percentage + "%");
    }
}
