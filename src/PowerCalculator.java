import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate powers
        double square = number * number;
        double cube = number * number * number;
        double fourthPower = Math.pow(number, 4);

        // Display results
        System.out.printf("Square: %.2f\n", square);
        System.out.printf("Cube: %.2f\n", cube);
        System.out.printf("Fourth power: %.2f\n", fourthPower);

        scanner.close();
    }
}

