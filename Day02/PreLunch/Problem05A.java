/*5. 
Print the following patterns using loop :
a.
*
**
***
****
*/
public class Problem05A {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
