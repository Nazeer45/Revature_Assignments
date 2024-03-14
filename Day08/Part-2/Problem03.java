/* Hour glass Star Pattern

            *********
             *******
              *****
               ***
                *
               ***
              *****
             *******
            *********
*/

public class Problem03 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the top half of the hourglass

        // Upper half of the hourglass
        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (rows - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = rows - 2; i >= 0; i--) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (rows - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
