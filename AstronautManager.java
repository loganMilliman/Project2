import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AstronautManager {
    private List<Astronaut> astronauts;
    private Scanner scanner;

    // Constructor
    public AstronautManager(Scanner scanner) {
        this.astronauts = new ArrayList<>();
        this.scanner = scanner;
    }

    // Method to add an astronaut
    public void addAstronaut() {
        System.out.println("Adding new astronaut:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter emergency contact: ");
        String emergencyContact = scanner.nextLine();
        System.out.print("Enter status: ");
        String status = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter weight: ");
        double weight = Double.parseDouble(scanner.nextLine());

        Astronaut newAstronaut = new Astronaut(name, dob, id, address, email, phone, emergencyContact, status, salary, weight);
        astronauts.add(newAstronaut);
        System.out.println("Astronaut added successfully.");
    }

    // Method to remove an astronaut
    public void removeAstronaut() {
        if (astronauts.isEmpty()) {
            System.out.println("No astronauts to remove.");
            return;
        }

        System.out.println("Select an astronaut to remove:");
        for (int i = 0; i < astronauts.size(); i++) {
            System.out.println((i + 1) + ". " + astronauts.get(i).getName());
        }
        System.out.print("Enter the number of the astronaut to remove: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice >= 1 && choice <= astronauts.size()) {
            astronauts.remove(choice - 1);
            System.out.println("Astronaut removed successfully.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Method to edit astronaut information
    public void editAstronaut(int index, Astronaut newAstronaut) {
        if (index >= 0 && index < astronauts.size()) {
            astronauts.set(index, newAstronaut);
            System.out.println("Astronaut information updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to retrieve astronaut information by index
    public Astronaut getAstronaut(int index) {
        if (index >= 0 && index < astronauts.size()) {
            return astronauts.get(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    // Method to get the number of astronauts
    public int getNumberOfAstronauts() {
        return astronauts.size();
    }

    // Method to view astronaut information
    public void viewAstronautInformation() {
        if (astronauts.isEmpty()) {
            System.out.println("No astronauts to display.");
            return;
        }

        System.out.println("Astronaut Information:");
        for (Astronaut astronaut : astronauts) {
            System.out.println("Name: " + astronaut.getName());
            System.out.println("Date of Birth: " + astronaut.getDateOfBirth());
            System.out.println("ID Number: " + astronaut.getIDnumb());
            System.out.println("Address: " + astronaut.getAddress());
            System.out.println("Email: " + astronaut.getEmail());
            System.out.println("Phone Number: " + astronaut.getPhoneNumb());
            System.out.println("Next of Kin: " + astronaut.getNextOfKin());
            System.out.println("Status: " + astronaut.getStatus());
            System.out.println("Salary: " + astronaut.getSalary());
            System.out.println("Weight: " + astronaut.getWeight());
            System.out.println("--------------------------------");
        }
    }
}
