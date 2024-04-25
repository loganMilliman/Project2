import java.util.ArrayList;
import java.util.List;

public class AstronautManager {
    private List<Astronaut> astronauts;

    // Constructor
    public AstronautManager() {
        this.astronauts = new ArrayList<>();
    }

    // Method to add an astronaut
    public void addAstronaut(Astronaut astronaut) {
        astronauts.add(astronaut);
    }

    // Method to remove an astronaut
    public void removeAstronaut(Astronaut astronaut) {
        astronauts.remove(astronaut);
    }

    // Method to edit astronaut information (for simplicity, let's assume we edit by index)
    public void editAstronaut(int index, Astronaut newAstronaut) {
        if (index >= 0 && index < astronauts.size()) {
            astronauts.set(index, newAstronaut);
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
}
