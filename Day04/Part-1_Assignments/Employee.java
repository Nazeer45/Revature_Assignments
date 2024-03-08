/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet
*/

public class Employee {
    String name;
    int yearOfJoining;
    String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to print employee details
    public static void printEmployeeDetails(Employee... employees) {
        System.out.printf("%-10s %-17s %-15s\n", "Name", "Year of joining", "Address");
        for (Employee emp : employees) {
            System.out.printf("%-10s %-17d %-15s\n", emp.name, emp.yearOfJoining, emp.address);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreet");

        printEmployeeDetails(emp1, emp2, emp3);
    }
}

