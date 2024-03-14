/*Print the Pattern
    ***** ***** *****
    *   * *   * *   *
    *   * *   * *   *
    *   * *   * *   *
    ***** ***** *****

*/

public class Problem01{
    public static void main(String []args){
        int rows = 5; // Total number of rows
        int sections = 3; // Total number of sections

        for (int i = 1; i <= rows; i++) {
            for (int sec = 1; sec <= sections; sec++) {
                for (int j = 1; j <= rows; j++) {
                    // Print stars for the first and last row, and first and last column of each section
                    if (i == 1 || i == rows || j == 1 || j == rows) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Space between sections
                System.out.print(" ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}