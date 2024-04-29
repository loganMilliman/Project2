import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PasswordManager {
    private static final String PASSWORD_FILE = "password.dat";

    // Method to check if a password exists
    public static boolean hasPassword() {
        File file = new File(PASSWORD_FILE);
        return file.exists();
    }

    // Method to verify the entered password
    public static boolean verifyPassword(String enteredPassword) {
        File passwordFile = new File(PASSWORD_FILE);
        if (!passwordFile.exists() || passwordFile.length() == 0) {
            return false; // No password set
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PASSWORD_FILE))) {
            String storedPassword = (String) inputStream.readObject();
            return storedPassword.equals(enteredPassword);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to create a new password
    public static void createPassword() {
        try (Scanner scanner = new Scanner(System.in);
             ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PASSWORD_FILE))) {
            System.out.println("Enter a new password: ");
            String newPassword = scanner.nextLine();
            outputStream.writeObject(newPassword);
            System.out.println("Password created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
