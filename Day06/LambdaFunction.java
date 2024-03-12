/*create a method that takes in 3 parameters,1.num,2.num,3.operator(+,-,*),
create a lamba fn that pass a num and operator and perform some operation.*/

import java.util.function.BiFunction;

public class LambdaFunction {

    public static void main(String[] args) {
        double result = calculate(5, 3, '+');
        System.out.println("Result: " + result);
    }

    public static double calculate(double num1, double num2, char operator) {
        BiFunction<Double, Double, Double> operation;

        switch (operator) {
            case '+':
                operation = (a, b) -> a + b;
                break;
            case '-':
                operation = (a, b) -> a - b;
                break;
            case '*':
                operation = (a, b) -> a * b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        return operation.apply(num1, num2);
    }
}
