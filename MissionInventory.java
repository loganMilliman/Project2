public class MissionInventory {
    private int initialRocketFuel;
    private int initialNumberOfRockets;
    private int rocketFuel;
    private int numberOfRockets;

    // Constructor
    public MissionInventory(int initialRocketFuel, int initialNumberOfRockets) {
        this.initialRocketFuel = initialRocketFuel;
        this.initialNumberOfRockets = initialNumberOfRockets;
        this.rocketFuel = initialRocketFuel;
        this.numberOfRockets = initialNumberOfRockets;
    }

    // Getters and setters for initial values
    public int getInitialRocketFuel() {
        return initialRocketFuel;
    }

    public void setInitialRocketFuel(int initialRocketFuel) {
        this.initialRocketFuel = initialRocketFuel;
    }

    public int getInitialNumberOfRockets() {
        return initialNumberOfRockets;
    }

    public void setInitialNumberOfRockets(int initialNumberOfRockets) {
        this.initialNumberOfRockets = initialNumberOfRockets;
    }

    // Getters and setters for current values
    public int getRocketFuel() {
        return rocketFuel;
    }

    public void setRocketFuel(int rocketFuel) {
        this.rocketFuel = rocketFuel;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }

    // Method to consume fuel
    public void consumeFuel(int fuelConsumption) {
        rocketFuel -= fuelConsumption;
    }
    public void updateMissionInventory(int initialRocketFuel, int initialNumberOfRockets) {
        this.initialRocketFuel = initialRocketFuel;
        this.initialNumberOfRockets = initialNumberOfRockets;
        this.rocketFuel = initialRocketFuel;
        this.numberOfRockets = initialNumberOfRockets;
    }
}
