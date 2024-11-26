import java.util.Scanner;

public class CircleSphereProperties {
    public static void main(String[] args) {
        // Constants
        final double PI = Math.PI;

        Scanner scanner = new Scanner(System.in);

        // Prompt for radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Calculations for the circle
        double circleArea = PI * radius * radius; // Area of circle
        double circumference = 2 * PI * radius; // Circumference of circle

        // Calculations for the sphere
        double sphereVolume = (4.0 / 3) * PI * Math.pow(radius, 3); // Volume of sphere
        double sphereSurfaceArea = 4 * PI * Math.pow(radius, 2); // Surface area of sphere

        // Display results
        System.out.printf("Circle Area:            %.2f%n", circleArea);
        System.out.printf("Circle Circumference:   %.2f%n", circumference);
        System.out.printf("Sphere Volume:          %.2f%n", sphereVolume);
        System.out.printf("Sphere Surface Area:    %.2f%n", sphereSurfaceArea);

        scanner.close();
    }
}

