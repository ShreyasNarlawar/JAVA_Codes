import java.util.Scanner;

public class AccountService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
        final int MAX_ACCOUNTS = 10; 
        // Define a maximum number of accounts
        Account[] accounts = new Account[MAX_ACCOUNTS];
        int accountCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Display Accounts");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Account
                    if (accountCount < MAX_ACCOUNTS) {
                        System.out.print("Enter Account Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double balance = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Account Type: ");
                        String type = scanner.nextLine();
                        accounts[accountCount] = new Account(name, balance, type);
                        accountCount++;
                        System.out.println("Account added successfully!");
                    } else {
                        System.out.println("Account limit reached. Cannot add more accounts.");
                    }
                    break;

                case 2:
                    // Delete Account
                    System.out.print("Enter Account ID to delete: ");
                    String acidToDelete = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].getAcid().equals(acidToDelete)) {
                            // Shift accounts left to fill the gap
                            for (int j = i; j < accountCount - 1; j++) {
                                accounts[j] = accounts[j + 1];
                            }
                            accounts[accountCount - 1] = null; // Clear last account reference
                            accountCount--;
                            found = true;
                            System.out.println("Account deleted successfully!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    // Display Accounts
                    if (accountCount == 0) {
                        System.out.println("No accounts available.");
                    } else {
                        for (int i = 0; i < accountCount; i++) {
                            System.out.println(accounts[i]);
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

		
}


