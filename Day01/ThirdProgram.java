/* 3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

public class ThirdProgram{
    public static void main(String []args){
        int Number = 2345;
        int add = 8;
        int div = 3;
        int mod = 5;
        int mul = 5;
        int result;

        result = (Number + add) / div;
        result = result % mod;
        result = result * mul;

        System.out.println("The final result is: " + result);
    }
}