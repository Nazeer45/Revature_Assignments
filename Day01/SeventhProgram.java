/* 7. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
*/
public class SeventhProgram {
    public static void main(String[] args) {

        int totalStudents = 90;
        int boys = 45;
        int girls = totalStudents - boys;
        int gradeA = totalStudents / 2;
        int boysGradeA = 20;
        int girlsGradeA;

        girlsGradeA = gradeA - boysGradeA;

        System.out.println("The total number of girls getting grade 'A' are: " + girlsGradeA);
    }
}
