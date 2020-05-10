package firstsemester;

/*
 * Amber Stone
 * 09.21.19
 * Description: This program takes user input for customer type and the charges 
 * for plumbing service then calculates discount per specifications. Customer   
 * type, discount amount applied, and net amount due are displayed.
 */
import java.util.Scanner;

public class PlumbingCharges {

    //Take user input for customer type and service charge
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter: 0 if you are a new customer, "
                + "1 if you are an existing customer: ");

        int customertype = input.nextInt();

        if (customertype > 1) {
            System.out.println("Invalid Customer Type.");
            System.exit(0);

        } else if (customertype == 0) {
            System.out.println("Customer Type: New");
        } else if (customertype == 1) {
            System.out.println("Customer Type: Existing");
        }

        System.out.print("Enter charges for plumbing service: $");
        double charge = input.nextDouble();

        //Discount constants
        final double DISCOUNT_NONE = 1;
        final double DISCOUNT_ONE = .05;
        final double DISCOUNT_TWO = .08;
        final double DISCOUNT_THREE = .04;
        final double DISCOUNT_FOUR = .1;
        final double DISCOUNT_FIVE = .06;

        //Compute and display results
        if (charge < 69) {
            System.out.print("Invalid Service Charge. ");

        } else if (customertype == 0 && charge >= 69 && charge <= 149) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_NONE));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_NONE)));

        } else if (customertype == 0 && charge >= 150 && charge <= 249) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_NONE));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_NONE)));

        } else if (customertype == 0 && charge >= 250 && charge <= 499) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_THREE));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_THREE)));

        } else if (customertype == 0 && charge >= 500) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_FIVE));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_FIVE)));

        } else if (customertype == 1 && charge >= 69 && charge <= 149) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_NONE));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_NONE)));

        } else if (customertype == 1 && charge >= 150 && charge <= 249) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_ONE));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_ONE)));

        } else if (customertype == 1 && charge >= 250 && charge <= 499) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_TWO));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_TWO)));

        } else if (customertype == 1 && charge >= 500) {
            System.out.println("Discount Amount: $" + (charge * DISCOUNT_FOUR));
            System.out.println("Your net amount due after discount: $"
                    + (charge - (charge * DISCOUNT_FOUR)));
        }

    }

}
