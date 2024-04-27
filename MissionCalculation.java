import java.text.DecimalFormat;

public class MissionCalculation {
    private static final double GRAVITY = 9.81; // m/s^2
    private static final double MAX_ATMOSPHERE_SPEED = 3000; // m/s
    private static final double ATMOSPHERE_END_ALTITUDE = 70000; // meters

    private double altitude;
    private double speed;
    private double fuel;

    public MissionCalculation() {
        this.altitude = 0;
        this.speed = 0;
        this.fuel = 100; // Initial fuel in pounds
    }

    public void burnFuel(int duration) {
        // Calculate speed gained based on fuel burned
        double speedGained = calculateSpeedGained(duration);

        speed += speedGained;
        altitude += speed;
        fuel -= duration;
    }

    private double calculateSpeedGained(int duration) {
        if (duration == 1) {
            return 30 * fuel;
        } else if (duration == 2) {
            return 15 * fuel;
        } else if (duration == 3) {
            return 60 * fuel;
        }
        return 0;
    }

    public void enterFreefall() {
        while (altitude > 0) {
            speed -= GRAVITY;
            altitude += speed;
            if (altitude > ATMOSPHERE_END_ALTITUDE && speed > MAX_ATMOSPHERE_SPEED) {
                System.out.println("Rocket burned up in the atmosphere!");
                break;
            }
        }
    }

    public void deployParachutes() {
        while (altitude > 10000) {
            speed -= GRAVITY;
            altitude += speed;
        }
        speed = Math.min(speed, 7);
    }

    public void landSafely() {
        System.out.println("Rocket has landed safely!");
        System.out.println("Door is opening...");
    }

    public double getAltitude() {
        return altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    // Utility method to format numbers uniformly
    public static String formatNumber(double number) {
        DecimalFormat formatter = new DecimalFormat("#,###.##");
        return formatter.format(number);
    }

    // Additional method to calculate total time in seconds based on remaining fuel
    public double calculateTotalTime() {
        // Assuming each pound of fuel burned for 1 second
        return fuel;
    }
}
