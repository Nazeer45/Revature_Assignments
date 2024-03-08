/*8. Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices*/

class Matrix1 {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix1(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position");
        }
    }

    public Matrix1 add(Matrix1 other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix1 result = new Matrix1(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    public Matrix1 multiply(Matrix1 other) {
        if (this.columns != other.rows) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Matrix1 result = new Matrix1(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.elements[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Matrix {
    public static void main(String[] args) {
        Matrix1 matrix1 = new Matrix1(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix1 matrix2 = new Matrix1(3, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();
        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        Matrix1 sum = matrix1.add(matrix2);
        if (sum != null) {
            System.out.println("Sum of matrices:");
            sum.printMatrix();
        }

        Matrix1 product = matrix1.multiply(matrix2);
        if (product != null) {
            System.out.println("Product of matrices:");
            product.printMatrix();
        }
    }
}
