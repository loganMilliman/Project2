import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String ASTRONAUT_FILE_PATH = "astronauts.dat";
    private static final String ROCKET_FILE_PATH = "rockets.dat";

    public static void saveAstronauts(ArrayList<Astronaut> astronauts) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ASTRONAUT_FILE_PATH))) {
            outputStream.writeObject(astronauts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Astronaut> loadAstronauts() {
        ArrayList<Astronaut> astronauts = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ASTRONAUT_FILE_PATH))) {
            astronauts = (ArrayList<Astronaut>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return astronauts;
    }

    public static void saveRockets(ArrayList<Rocket> rockets) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ROCKET_FILE_PATH))) {
            outputStream.writeObject(rockets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Rocket> loadRockets() {
        ArrayList<Rocket> rockets = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ROCKET_FILE_PATH))) {
            rockets = (ArrayList<Rocket>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rockets;
    }
}
