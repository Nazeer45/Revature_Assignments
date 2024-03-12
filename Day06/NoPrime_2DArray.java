import java.util.Scanner;

public class NoPrime_2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter array elements (non-prime numbers):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.printf("Enter element for [%d][%d]: ", i, j);
                    int number = scanner.nextInt();
                    if (!isPrime(number)) {
                        array[i][j] = number;
                        break;
                    } else {
                        System.out.println("It is a prime, please enter a non-prime number.");
                    }
                }
            }
        }
        System.out.println("2D Array with no prime numbers:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
