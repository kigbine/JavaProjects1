import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter monthly savings value
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();

        // Compute amount value after six month
        double value = (100 + 506.287) * (1 + 0.00417);

        // Display results
        System.out.println("After the sixth month, the account value is $"+value);

    }
}
