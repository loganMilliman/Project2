public class MissionLaunch {
    private MissionInventory inventory;
    private Astronaut[] astronauts;

    public MissionLaunch(MissionInventory inventory, Astronaut[] astronauts) {
        this.inventory = inventory;
        this.astronauts = astronauts;
    }

    public void initiateLaunch() {
        System.out.println("Initiating launch sequence...");
        countdown();
    }

    private void countdown() {
        System.out.print("Countdown: ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ignition!");
        launch();
    }

    private void launch() {
        double totalWeight = 0;
        for (Astronaut astronaut : astronauts) {
            totalWeight += astronaut.getWeight();
        }

        MissionCalculation missionCalculation = new MissionCalculation();
        missionCalculation.burnFuel(3); // Burn fuel for 3 seconds

        double altitude = missionCalculation.getAltitude();
        double speed = missionCalculation.getSpeed();

        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Speed: " + speed + " meters per second");

        inventory.consumeFuel((int) (totalWeight * 10)); // Adjust as needed
        System.out.println("Rocket launched!");
    }
}
