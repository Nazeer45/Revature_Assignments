/* 2. Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments. */

public class SecondProgram{
    public static void main(String []args){
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);
        int PerimeterOfTriangle = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle is : "+PerimeterOfTriangle);
    }
}