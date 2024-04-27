import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // Check if password exists
        if (!PasswordManager.hasPassword()) {
            // If password does not exist, create a new one
            System.out.println("No existing password found. Creating a new password...");
            PasswordManager.createPassword();
        } else {
            // If password exists, prompt user for password verification
            System.out.println("Enter your password to continue:");
            boolean isPasswordCorrect = PasswordManager.verifyPassword();
            if (!isPasswordCorrect) {
                System.out.println("Incorrect password. Access denied.");
                kbd.close();
                return;
            }
        }

        // Proceed with other functionalities
        // Create astronauts
        Astronaut astronaut1 = new Astronaut("John Doe", "1990-01-01", "123456789", "123 Main St", "john@example.com", "(123) 456-7890", "Jane Doe", "In-space", 50000.0, 70.0);
        Astronaut astronaut2 = new Astronaut("Jane Smith", "1985-05-05", "987654321", "456 Oak St", "jane@example.com", "(456) 789-0123", "John Smith", "On Earth", 55000.0, 65.0);

        // Create rocket inventory
        MissionInventory missionInventory = new MissionInventory(1000, 3); // Initial rocket fuel: 1000 pounds, Initial number of rockets: 3

        // Launch mission if verification is successful
        if (VerificationSystem.verifyAction()) {
            // Perform launch process
            MissionLaunch missionLaunch = new MissionLaunch(missionInventory, new Astronaut[]{astronaut1, astronaut2});
            missionLaunch.initiateLaunch();
        } else {
            System.out.println("Verification failed. Cannot initiate launch.");
        }

        // Close scanner
        kbd.close();
    }
}
