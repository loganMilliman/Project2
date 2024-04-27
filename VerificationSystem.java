import java.util.Scanner;

public class VerificationSystem {
    private static final String VERIFICATION_KEY = "RocketLaunch";

    public static boolean verifyAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the verification key to proceed:");
        String inputKey = scanner.nextLine();
        scanner.close();
        return inputKey.equals(VERIFICATION_KEY);
    }
}
