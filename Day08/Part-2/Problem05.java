/* Left pascal star

           *
         * *
       * * *
     * * * *
   * * * * *
     * * * *
       * * *
         * *
           *


*/

public class Problem05 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the upper half of the triangle

        // Upper half of the triangle
        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = 2 * (rows - i); j >= 0; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the triangle
        for (int i = rows - 2; i >= 0; i--) {
            // Printing spaces
            for (int j = 2 * (rows - i); j >= 0; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
