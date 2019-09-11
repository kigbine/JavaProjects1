import java.util.Scanner;

public class Feet {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        // Compute meter
        double meter = feet * 0.305;

        // Display results
        System.out.println(feet + " feet is " + meter + " meters");

    }
}