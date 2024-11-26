import java.util.Scanner;

public class NumberOperationsAligned {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;
        int distance = Math.abs(difference);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        // Display results with proper alignment
        System.out.printf("Sum:            %10d%n", sum);
        System.out.printf("Difference:     %10d%n", difference);
        System.out.printf("Product:        %10d%n", product);
        System.out.printf("Average:        %10.2f%n", average);
        System.out.printf("Distance:       %10d%n", distance);
        System.out.printf("Maximum:        %10d%n", maximum);
        System.out.printf("Minimum:        %10d%n", minimum);

        scanner.close();
    }
}
