/* Print the pattern
    
    *************
    *   *   *   *
    *   *   *   *
    *   *   *   *
    *************
*/

public class Problem02 {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows
        int columns = 13; // Total number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Print stars for the first and last row, and where columns are multiples of 4
                if (i == 0 || i == rows - 1 || j % 4 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
