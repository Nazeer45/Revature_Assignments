/*  Print the pattern

                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *   
                
                * * * * *   * * * * *   * * * * *   
                * * * * *   * * * * *   * * * * *
                * * * * *   * * * * *   * * * * *
                * * * * *   * * * * *   * * * * *
                * * * * *   * * * * *   * * * * *
*/

public class Problem05 {
    public static void main(String[] args) {
        int blocks = 3; // Number of blocks horizontally and vertically
        int size = 5; // Size of each block

        for (int blockRow = 0; blockRow < blocks; blockRow++) {
            for (int row = 0; row < size; row++) {
                for (int blockCol = 0; blockCol < blocks; blockCol++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print("* ");
                    }
                    System.out.print("  "); // Space between blocks
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // New line after each block
        }
    }
}
