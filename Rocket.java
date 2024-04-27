public class Rocket {
    private int rocketFuel; // Current amount of rocket fuel in pounds

    public Rocket(int initialRocketFuel) {
        this.rocketFuel = initialRocketFuel;
    }

    public int getRocketFuel() {
        return rocketFuel;
    }

    public void setRocketFuel(int rocketFuel) {
        this.rocketFuel = rocketFuel;
    }

    public void addRocketFuel(int fuelAmount) {
        rocketFuel += fuelAmount;
        System.out.println("Rocket fuel added: " + fuelAmount + " pounds");
    }

    public void consumeFuel(int fuelConsumed) {
        if (fuelConsumed <= rocketFuel) {
            rocketFuel -= fuelConsumed;
            System.out.println("Rocket fuel consumed: " + fuelConsumed + " pounds");
        } else {
            System.out.println("Insufficient fuel for consumption.");
        }
    }

    public void checkInventory() {
        System.out.println("Current Rocket Fuel: " + rocketFuel + " pounds");
        // Additional inventory checks can be added here
    }
}
