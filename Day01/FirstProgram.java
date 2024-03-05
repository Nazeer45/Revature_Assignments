/* 1. Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments. */

public class FirstProgram{
	public static void main(String []args){
	int length = Integer.parseInt(args[0]);
	int breadth = Integer.parseInt(args[1]);
	int AreaOfRectangle = length * breadth;
	int PerimeterOfRectangle = 2 * (length + breadth);
	System.out.println("AreaOfRectangle is: "+ AreaOfRectangle);
	System.out.println("Perimeter of Rectangle is: "+ PerimeterOfRectangle);
	}
}