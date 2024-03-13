/*The right triangle star pattern is also the same as the left triangle star pattern but it has a shape of a triangle with its perpendicular line at the right side.

            *
          * *
        * * *
      * * * *
    * * * * *

*/

public class Problem02 {
    public static void main(String []args){

        int rows = 5;

        for(int i=0;i<rows;i++){

            for(int j=i;j<4;j++){
                // Printing Spaces
                System.out.print("  ");
            }

            for(int k=0;k<i+1;k++){
                // Printing Stars
                System.out.print("* ");

            }
            // Line Brake
            System.out.println("");
        }
    }
}
