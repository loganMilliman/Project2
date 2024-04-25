import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Space Mission Management System!");

        // Check if password exists, if not prompt to create one
        if (!Password.Password.checkIfPasswordExists()) {
            Password.Password.createPassword();
        }

        // Example usage: check if the entered password is correct
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();
        if (Password.Password.checkPassword(inputPassword)) {
            System.out.println("Password correct.");

            // Initialize AstronautManager
            AstronautManager astronautManager = new AstronautManager();

            // Example usage: Add an astronaut
            Astronaut astronaut1 = new Astronaut("John Doe", "01/01/1980", "12345", "123 Space St", "john@example.com", "(123)456-7890", "Jane Doe", "In Space", 1000.0, 80.0);
            astronautManager.addAstronaut(astronaut1);

            // Example usage: Get astronaut information
            Astronaut retrievedAstronaut = astronautManager.getAstronaut(0);
            if (retrievedAstronaut != null) {
                System.out.println("Retrieved astronaut: " + retrievedAstronaut.getName());
            }

            // Other functionalities can be added here

        } else {
            System.out.println("Incorrect password. Access denied.");
        }
        
        scanner.close();
    }
}
