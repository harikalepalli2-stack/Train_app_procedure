import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Train_app_procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (can be replaced with Scanner input if needed)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        System.out.println("\nTrain ID Validation:");
        if (trainMatcher.matches()) {
            System.out.println(trainId + " is VALID");
        } else {
            System.out.println(trainId + " is INVALID");
        }

        // Validate Cargo Code
        System.out.println("\nCargo Code Validation:");
        if (cargoMatcher.matches()) {
            System.out.println(cargoCode + " is VALID");
        } else {
            System.out.println(cargoCode + " is INVALID");
        }

        // Program continues...
    }
}