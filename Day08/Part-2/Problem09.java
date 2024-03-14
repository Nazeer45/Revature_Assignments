/*  Left triangle number pattern
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
*/

public class Problem09 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
