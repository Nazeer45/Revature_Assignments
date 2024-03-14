/*  The plus star pattern has the shape of the mathematical plus sign (+)
                     *
                     * 
                 * * * * *
                     *
                     * 
*/

public class Problem07 {
    public static void main(String[] args) {
        int size = 5; // The total height/width of the pattern

        // Middle index where the horizontal line of the plus sign will be printed
        int middle = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print star at the middle row or middle column
                if (i == middle || j == middle) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces elsewhere
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
