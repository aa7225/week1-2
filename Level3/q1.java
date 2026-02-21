import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create a celsius variable and take user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Step 2: Use the Formula (C * 9/5) + 32
        // Note: Using 9.0 / 5.0 ensures decimal precision during division
        double farenheitResult = (celsius * 9.0 / 5.0) + 32;

        // Step 3: Print the result in the specified format
        System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");

        input.close();
    }
}
