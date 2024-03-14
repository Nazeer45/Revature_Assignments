/* Heart pattern
         
           ***   ***
          ***** *****
          ***********
           *********
            *******
             *****
              ***
               *

*/

public class Problem06 {
    public static void main(String[] args) {
        int i, j;
        int n = 6; // n is the number of rows

        // Upper part of the heart
        for (i = n / 2; i <= n; i += 2) {
            // Print leading spaces
            for (j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Print first half of the heart
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print space between the two halves of the heart
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print second half of the heart
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part of the heart
        for (i = n; i >= 1; i--) {
            // Print leading spaces
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print lower part of the heart
            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
