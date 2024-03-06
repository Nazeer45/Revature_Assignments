/*5. Write a program to find the sum and product of all elements of an array.*/
public class Problem05 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}
