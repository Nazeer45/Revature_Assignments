/* The cross pattern has the shape of the mathematical cross sign (X)
                        *   *
                         * *
                          *
                         * *
                        *   *
*/

public class Problem08 {
    public static void main(String[] args) {
        int size = 5; // The total height/width of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print stars at the diagonals of the square matrix
                if (i == j || i + j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces elsewhere
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
