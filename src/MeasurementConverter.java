import java.util.Scanner;

public class MeasurementConverter {
    public static void main(String[] args) {
        // Conversion constants
        final double METERS_TO_MILES = 0.000621371;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.3701;

        Scanner scanner = new Scanner(System.in);

        // Prompt for a measurement in meters
        System.out.print("Enter measurement in meters: ");
        double meters = scanner.nextDouble();

        // Convert to miles, feet, and inches
        double miles = meters * METERS_TO_MILES;
        double feet = meters * METERS_TO_FEET;
        double inches = meters * METERS_TO_INCHES;

        // Display results
        System.out.printf("Miles:  %.6f%n", miles);
        System.out.printf("Feet:   %.2f%n", feet);
        System.out.printf("Inches: %.2f%n", inches);

        scanner.close();
    }
}
