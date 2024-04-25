import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Password {
    private static final String PASSWORD_FILE_PATH = "password.txt";

    // Method to check if a password file exists
    public static boolean checkIfPasswordExists() {
        File passwordFile = new File(PASSWORD_FILE_PATH);
        return passwordFile.exists() && passwordFile.length() > 0;
    }

    // Method to create a new password
    public static void createPassword() {
        if (!checkIfPasswordExists()) {
            try {
                File passwordFile = new File(PASSWORD_FILE_PATH);
                System.out.println("No password set. Please create a password.");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your new password: ");
                String newPassword = scanner.nextLine();
                FileWriter writer = new FileWriter(passwordFile);
                writer.write(newPassword);
                writer.close();
                System.out.println("Password set successfully.");
                scanner.close();
            } catch (IOException e) {
                System.out.println("Error setting password: " + e.getMessage());
            }
        } else {
            System.out.println("Password already set.");
        }
    }

    // Method to set a password
    public static void setPassword(String password) {
        try {
            FileWriter writer = new FileWriter(PASSWORD_FILE_PATH);
            writer.write(password);
            writer.close();
            System.out.println("Password set successfully.");
        } catch (IOException e) {
            System.out.println("Error setting password: " + e.getMessage());
        }
    }

    // Method to check if the entered password is correct
    public static boolean checkPassword(String inputPassword) {
        try {
            File passwordFile = new File(PASSWORD_FILE_PATH);
            if (passwordFile.exists() && passwordFile.length() > 0) {
                String storedPassword = new String(Files.readAllBytes(Paths.get(PASSWORD_FILE_PATH)));
                return storedPassword.equals(inputPassword);
            }
        } catch (IOException e) {
            System.out.println("Error checking password: " + e.getMessage());
        }
        return false;
    }
}
