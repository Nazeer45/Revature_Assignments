/*1. Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.
*/

import java.time.LocalDate;

class EmployeeClass {
    private String name;
    private double salary;
    private LocalDate dateOfJoining;

    public EmployeeClass(String name, double salary, LocalDate dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeClass[] employeeClasss = new EmployeeClass[10];

        employeeClasss[0] = new EmployeeClass("John", 50000, LocalDate.of(2020, 2, 15));
        employeeClasss[1] = new EmployeeClass("Alice", 60000, LocalDate.of(2019, 6, 20));
        employeeClasss[2] = new EmployeeClass("Bob", 55000, LocalDate.of(2021, 4, 10));
        employeeClasss[3] = new EmployeeClass("Eva", 52000, LocalDate.of(2018, 9, 25));
        employeeClasss[4] = new EmployeeClass("Michael", 58000, LocalDate.of(2022, 3, 5));
        employeeClasss[5] = new EmployeeClass("Sophia", 53000, LocalDate.of(2020, 8, 12));
        employeeClasss[6] = new EmployeeClass("David", 54000, LocalDate.of(2017, 11, 30));
        employeeClasss[7] = new EmployeeClass("Emma", 59000, LocalDate.of(2019, 5, 8));
        employeeClasss[8] = new EmployeeClass("Ryan", 57000, LocalDate.of(2021, 7, 18));
        employeeClasss[9] = new EmployeeClass("Olivia", 56000, LocalDate.of(2022, 10, 22));

        System.out.println("EmployeeClass Details:");
        System.out.println("--------------------------------------");
        System.out.println("Name\t\tSalary\t\tDate of Joining");
        System.out.println("--------------------------------------");
        for (EmployeeClass emp : employeeClasss) {
            System.out.println(emp.getName() + "\t\t$" + emp.getSalary() + "\t\t" + emp.getDateOfJoining());
        }
        System.out.println("--------------------------------------");
    }
}
