package firstsemester;

/*
 * Amber Stone
 * 09.11.19
 * Description: This program computes taxi charges for distance traveled and tip 
 * added per user input
 */
import java.util.Scanner;

public class TaxiCostPlusTip {

    public static void main(String[] args) {
        //Step 1: Take user input for distance traveled in miles
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter number of miles traveled: ");
        double miles = input.nextDouble();

        //Step 2: Take user input for tip amount
        System.out.print(" Enter tip amount in USD: ");
        double tipamount = input.nextDouble();

        //Step 3: Compute total amount for taxi ride
        final double FIRST_MILE_CHARGE = 4.50;
        final double EACH_ADDITIONAL_MILE = 2.00;
        double total = FIRST_MILE_CHARGE + (EACH_ADDITIONAL_MILE * --miles)
                + tipamount;

        //Step 4: Displays total amount
        System.out.println(" The total amount for traveling " + miles
                + " miles and including a $" + tipamount + " tip is $" + total);

    }

}
