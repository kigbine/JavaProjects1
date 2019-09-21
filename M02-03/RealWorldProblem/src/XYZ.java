import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter last and first name
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        // Prompt the user to enter Address
        System.out.print("Enter Address Line 1: ");
        String addressLine1 = input.nextLine();

        System.out.print("Enter City: ");
        String city = input.nextLine();

        System.out.print("Enter State: ");
        String state = input.nextLine();

        System.out.print("Enter Zip code: ");
        String zipCode = input.nextLine();

        // Prompt the user to enter Payment Information
        System.out.print("Enter Amount owed: ");
        double amountOwed = input.nextDouble();

        System.out.print("Enter Payment Amount: ");
        double paymentAmount = input.nextDouble();

        System.out.print("Enter Payment Date: ");
        String paymentDate = input.next();

        // Display result
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tXYZ Community Hospital");
        System.out.println("========================================================================================================================");
        System.out.println("\t\tName\t\t\t\t\t\t\t\t\t\tAddress\t\t\t\t\t\t\t\t\tPayment Information");
        System.out.println("Last\t\tFirst\t\t\tAddress Line 1\t\tCity\t\tState\t\tZip\t\tAmount Owed\tPayment Amt.\tPayment Date");
        System.out.println("========================================================================================================================");
        System.out.println(lastName +"\t\t"+firstName + "\t\t\t"+addressLine1+"\t\t"+city+"\t" +state +"\t\t"+ zipCode+"\t\t"+"$"+amountOwed+"\t\t"+"$"+paymentAmount+"\t\t\t"+paymentDate);



    }
}
