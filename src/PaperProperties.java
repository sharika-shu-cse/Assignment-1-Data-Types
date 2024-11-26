public class PaperProperties {
    public static void main(String[] args) {
        // Constants
        final double INCH_TO_MM = 25.4; // Millimeters per inch
        final double WIDTH_INCHES = 8.5; // Width in inches
        final double HEIGHT_INCHES = 11.0; // Height in inches

        // Convert dimensions to millimeters
        double widthMM = WIDTH_INCHES * INCH_TO_MM;
        double heightMM = HEIGHT_INCHES * INCH_TO_MM;

        // Calculate perimeter and diagonal
        double perimeterMM = 2 * (widthMM + heightMM);
        double diagonalMM = Math.sqrt(widthMM * widthMM + heightMM * heightMM);

        // Display results
        System.out.printf("Width: %.2f mm\n", widthMM);
        System.out.printf("Height: %.2f mm\n", heightMM);
        System.out.printf("Perimeter: %.2f mm\n", perimeterMM);
        System.out.printf("Diagonal: %.2f mm\n", diagonalMM);
    }
}
