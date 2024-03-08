/*2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/
public class Student {
    String name;
    int roll_no;
    String phone;
    String address;

    public Student(String name, int roll_no, String phone, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone = phone;
        this.address = address;
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Phone Number: " + phone);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 2, "1234567890", "1234 Main St");
        Student student2 = new Student("Sam", 3, "0987654321", "5678 Second St");

        student1.printStudentDetails();
        student2.printStudentDetails();
    }
}
