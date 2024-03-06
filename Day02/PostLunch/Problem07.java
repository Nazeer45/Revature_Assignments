/*7. Find largest and smallest elements of an array.*/
public class Problem07 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7, 3, 6 };

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
