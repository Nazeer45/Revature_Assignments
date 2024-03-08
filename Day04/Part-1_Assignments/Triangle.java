/*3. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
 */
public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
        System.out.println("The area of the triangle is: " + triangle.getArea());
    }
}

