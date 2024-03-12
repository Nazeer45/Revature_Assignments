/*create a class employee having id,name and salary.
create constructors,getter ,setters.
In the main class create an array List containing 4 diff employee obj, using Stream API display the details of employee having salary > 400000 ,
Update the emp salary by 25% and display the same,
Convert the names of emp to uppercase and store it in another list named as empNames and display it.*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class StreamsExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Rohan", 500000));
        employees.add(new Employee(2, "Arjun", 300000));
        employees.add(new Employee(3, "Sana", 600000));
        employees.add(new Employee(4, "Lokesh", 400000));

        // Display details of employees with salary > 400000
        employees.stream()
                .filter(e -> e.getSalary() > 400000)
                .forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary()));

        // Update the employee salary by 25% and display the same
        employees.stream()
                .forEach(e -> {
                    e.setSalary(e.getSalary() * 1.25);
                    System.out.println("Updated Salary of " + e.getName() + ": " + e.getSalary());
                });

        // Convert the names of employees to uppercase and store it in another list
        List<String> empNames = employees.stream()
                .map(e -> e.getName().toUpperCase())
                .collect(Collectors.toList());

        // Display the names in uppercase
        empNames.forEach(System.out::println);
    }
}
