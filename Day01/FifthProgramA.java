/* 5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable
 */
public class FifthProgramA {
    public static void main(String []args){
    int a = 6;
        int b = 8;
        int temp;

        System.out.println("The original values of a and b are: " + a + " and " + b);

        temp = a; 
        a = b;
        b = temp;

        System.out.println("The swapped values of a and b are: " + a + " and " + b);
    }
}
