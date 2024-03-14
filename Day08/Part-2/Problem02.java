/*  Hollow Diamond star pattern
            *
           * *
          *   *
         *     *
        *       *
         *     *
          *   *
           * *
            *

*/

public class Problem02 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for each half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Printing spaces before the star
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Printing the first star
            System.out.print("*");
            // Printing spaces between the stars
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                // Printing the second star
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Printing spaces before the star
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Printing the first star
            System.out.print("*");
            // Printing spaces between the stars
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                // Printing the second star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
