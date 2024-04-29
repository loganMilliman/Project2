import java.util.Scanner;

public class Main {
    private static Rocket rocket = new Rocket(0);

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
            String enteredPassword = kbd.nextLine();
            boolean isPasswordCorrect = PasswordManager.verifyPassword(enteredPassword);
            if (!isPasswordCorrect) {
                System.out.println("Incorrect password. Access denied.");
                kbd.close();
                return;
            }
        }

        // Proceed with other functionalities
        System.out.println("Welcome! You can choose to manage astronaut information, rocket information, or launch.");

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("[1] Manage Astronaut Information");
            System.out.println("[2] Manage Rocket Information");
            System.out.println("[3] Launch");
            System.out.print("Enter your choice: ");
            choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    manageAstronautInformation(kbd);
                    break;
                case 2:
                    manageRocketInformation(kbd);
                    break;
                case 3:
                    launchMission(kbd);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        // Close scanner
        kbd.close();
    }

    public static void manageAstronautInformation(Scanner kbd) {
        AstronautManager astronautManager = new AstronautManager(kbd);

        do {
            System.out.println("Astronaut Management Menu:");
            System.out.println("[1] Add Astronaut");
            System.out.println("[2] Remove Astronaut");
            System.out.println("[3] Edit Astronaut Information");
            System.out.println("[4] View Astronaut Information");
            System.out.println("[5] Go Back");
            System.out.print("Enter your choice: ");
            int choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    astronautManager.addAstronaut();
                    break;
                case 2:
                    astronautManager.removeAstronaut();
                    break;
                case 3:
                    // Placeholder
                    astronautManager.editAstronaut(0, null);
                    break;
                case 4:
                    astronautManager.viewAstronautInformation();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    public static void manageRocketInformation(Scanner kbd) {
        Rocket rocket = new Rocket(0);

        do {
            System.out.println("Rocket Management Menu:");
            System.out.println("[1] Add Rocket Fuel");
            System.out.println("[2] Consume Rocket Fuel");
            System.out.println("[3] Check Rocket Inventory");
            System.out.println("[4] Go Back");
            System.out.print("Enter your choice: ");
            int choice = kbd.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount of fuel to add: ");
                    int fuelToAdd = kbd.nextInt();
                    rocket.addRocketFuel(fuelToAdd);
                    break;
                case 2:
                    System.out.print("Enter amount of fuel to consume: ");
                    int fuelToConsume = kbd.nextInt();
                    rocket.consumeFuel(fuelToConsume);
                    break;
                case 3:
                    rocket.checkInventory();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    public static void launchMission(Scanner kbd) {
        System.out.println("Initiating launch sequence...");

        // Check if there's enough fuel to launch
        if (rocket.getRocketFuel() <= 0) {
            System.out.println("Insufficient fuel to launch.");
            return;
        }

        // Create astronauts for the mission
        Astronaut[] astronauts = createAstronauts(kbd);

        // Create mission inventory
        MissionInventory missionInventory = new MissionInventory(rocket.getRocketFuel(), 1); // Initial number of rockets: 1

        // Create and initiate launch
        MissionLaunch missionLaunch = new MissionLaunch(missionInventory, astronauts);
        missionLaunch.initiateLaunch();
    }

    public static Astronaut[] createAstronauts(Scanner kbd) {
        System.out.println("Creating Astronauts...");
        return new Astronaut[0]; // Placeholder return
    }
}
