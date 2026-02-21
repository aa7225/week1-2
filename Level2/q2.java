import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base of the triangle (cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (cm): ");
        double height = input.nextDouble();

        // Calculate Area in square centimeters (sq cm)
        double areaSqCm = 0.5 * base * height;

        // Calculate Area in square inches (sq in)
        // Conversion: 1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

        input.close();
    }
}
