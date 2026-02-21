import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();

        // Calculate Average
        double average = (maths + physics + chemistry) / 3;

        // Output result
        System.out.println("------------------------------");
        System.out.println("Sam's average marks in PCM is: " + average + "%");
        
        input.close();
    }
}
