import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PasswordManager {
    private static final String PASSWORD_FILE = "password.txt";

    // Method to check if a password exists
    public static boolean hasPassword() {
        File file = new File(PASSWORD_FILE);
        return file.exists();
    }

    // Method to verify the entered password
    public static boolean verifyPassword(String enteredPassword) {
        try {
            File file = new File(PASSWORD_FILE);
            Scanner scanner = new Scanner(file);
            String storedPassword = scanner.nextLine();
            scanner.close();
            return storedPassword.equals(enteredPassword);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to create a new password
    public static void createPassword() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a new password: ");
            String newPassword = scanner.nextLine();
            scanner.close();
            FileWriter writer = new FileWriter(PASSWORD_FILE);
            writer.write(newPassword);
            writer.close();
            System.out.println("Password created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
