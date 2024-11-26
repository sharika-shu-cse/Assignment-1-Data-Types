import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the lengths of the rectangle's sides
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Calculate the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(length * length + width * width);

        // Display results
        System.out.printf("Area:       %.2f%n", area);
        System.out.printf("Perimeter:  %.2f%n", perimeter);
        System.out.printf("Diagonal:   %.2f%n", diagonal);

        scanner.close();
    }
}