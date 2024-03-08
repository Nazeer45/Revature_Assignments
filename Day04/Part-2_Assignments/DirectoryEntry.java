import java.util.ArrayList;
import java.util.Scanner;

class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private int uniqueID;

    // Constructor to initialize DirectoryEntry object
    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber,
                          String headOfFamily, int uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
}

public class Directory {
    private ArrayList<DirectoryEntry> entries;

    // Constructor to initialize Directory
    public Directory() {
        this.entries = new ArrayList<>();
    }

    // Method to create a new directory entry
    public void createEntry(String name, String address, String telephoneNumber, String mobileNumber,
                            String headOfFamily, int uniqueID) {
        DirectoryEntry newEntry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber,
                headOfFamily, uniqueID);
        entries.add(newEntry);
        System.out.println("Entry created successfully.");
    }

    // Method to edit an existing entry by unique ID
    public void editEntry(int uniqueID) {
        for (DirectoryEntry entry : entries) {
            if (entry.getUniqueID() == uniqueID) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Editing entry for Unique ID: " + uniqueID);
                System.out.print("Enter new name: ");
                entry.name = scanner.nextLine();
                System.out.print("Enter new address: ");
                entry.address = scanner.nextLine();
                System.out.print("Enter new telephone number: ");
                entry.telephoneNumber = scanner.nextLine();
                System.out.print("Enter new mobile number: ");
                entry.mobileNumber = scanner.nextLine();
                System.out.print("Enter new head of family: ");
                entry.headOfFamily = scanner.nextLine();
                System.out.println("Entry edited successfully.");
                return;
            }
        }
        System.out.println("Entry with Unique ID " + uniqueID + " not found.");
    }

    // Method to search entries by keyword
    public void search(String keyword) {
        System.out.println("Search Results:");
        for (DirectoryEntry entry : entries) {
            if (entry.getName().contains(keyword) || entry.getAddress().contains(keyword) ||
                    entry.getTelephoneNumber().contains(keyword) || entry.getMobileNumber().contains(keyword) ||
                    entry.getHeadOfFamily().contains(keyword) || String.valueOf(entry.getUniqueID()).contains(keyword)) {
                entry.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a new directory entry");
            System.out.println("2. Edit an existing entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter unique ID: ");
                    int uniqueID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    directory.createEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    break;
                case 2:
                    System.out.print("Enter unique ID of entry to edit: ");
                    int editID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    directory.editEntry(editID);
                    break;
                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.search(keyword);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
