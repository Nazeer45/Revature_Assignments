import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicate_2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        Set<Integer> values = new HashSet<>();
        System.out.println("Enter unique numbers for the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; ) {
                System.out.printf("Enter element for position [%d][%d]: ", i, j);
                int input = scanner.nextInt();
                if (values.add(input)) {
                    array[i][j] = input;
                    j++;
                } else {
                    System.out.println("The number is a duplicate. Please enter a unique number.");
                }
            }
        }
        System.out.println("2D array with no duplicate values:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
