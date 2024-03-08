/*3. Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions
*/

import java.util.Scanner;

class BankAccount {
    private static int accountCounter = 1000;
    private String accountNumber;
    private String name;
    private String address;
    private String type;
    private double balance;
    private int numOfTransactions;

    public BankAccount(String name, String address, String type, double balance) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.balance = balance;
        this.numOfTransactions = 0;
        this.accountNumber = "BA" + accountCounter;
        accountCounter++;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Type of Account: " + type);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        numOfTransactions++;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numOfTransactions++;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumOfTransactions() {
        return numOfTransactions;
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine();

        BankAccount[] accounts = new BankAccount[numDepositors];

        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Type of account: ");
            String type = scanner.nextLine();
            System.out.print("Initial balance: $");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            accounts[i] = new BankAccount(name, address, type, balance);
        }

        System.out.println("\nInformation of a depositor:");
        accounts[0].displayInfo();

        System.out.println("\nDepositing amount to a depositor's account:");
        accounts[1].deposit(100);
        accounts[1].displayInfo();

        System.out.println("\nWithdrawing amount from a depositor's account:");
        accounts[2].withdraw(50);
        accounts[2].displayInfo();

        System.out.println("\nChanging address of a depositor:");
        accounts[3].changeAddress("New Address");
        accounts[3].displayInfo();

        System.out.println("\nRandom operations:");
        for (int i = 0; i < 2; i++) {
            int randomIndex = (int) (Math.random() * numDepositors);
            System.out.println("\nRandom Operation for depositor " + (randomIndex + 1));
            double depositAmount = Math.random() * 1000;
            accounts[randomIndex].deposit(depositAmount);
            accounts[randomIndex].displayInfo();

            double withdrawAmount = Math.random() * 500;
            accounts[randomIndex].withdraw(withdrawAmount);
            accounts[randomIndex].displayInfo();

            String newAddress = "New Address " + (int) (Math.random() * 1000);
            accounts[randomIndex].changeAddress(newAddress);
            accounts[randomIndex].displayInfo();
        }

        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getNumOfTransactions();
        }
        System.out.println("\nTotal number of transactions: " + totalTransactions);
        scanner.close();
    }
}
