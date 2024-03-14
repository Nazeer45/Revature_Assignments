/*  Diamond star pattern
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *

*/
public class Problem01{
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}