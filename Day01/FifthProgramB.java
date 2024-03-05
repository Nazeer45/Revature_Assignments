public class FifthProgramB {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        System.out.println("The original values of a and b are: " + a + " and " + b);

        a = a + b;
        b = a - b;
        a = a - b; 

        System.out.println("The swapped values of a and b are: " + a + " and " + b);
    }
}
