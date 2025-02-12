
package dhanuintern2;
import java.util.Scanner;
public class simplebankingapp {
	    private static double balance = 0.0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        System.out.println("Welcome to Simple Banking Application!");
	        do {
	            System.out.println("\nSelect an option:");
	            System.out.println("1. Deposit Money");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    deposit(scanner);
	                    break;
	                case 2:
	                    withdraw(scanner);
	                    break;
	                case 3:
	                    checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using Simple Banking Application. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	    public static void deposit(Scanner scanner) {
	        System.out.print("Enter the amount to deposit: ");
	        double amount = scanner.nextDouble();
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited $" + amount);
	        } else {
	            System.out.println("Invalid amount. Deposit must be greater than 0.");
	        }
	    }
	    public static void withdraw(Scanner scanner) {
	        System.out.print("Enter the amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Successfully withdrew $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance. Transaction failed.");
	        } else {
	            System.out.println("Invalid amount. Withdrawal must be greater than 0.");
	        }
	    }
	    public static void checkBalance() {
	        System.out.println("Your current balance is: $" + balance);
	    }
	}
