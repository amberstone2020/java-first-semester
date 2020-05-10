package firstsemester;

/*
 * Amber Stone
 * 09.11.19
 * Description: This program prints the area of a trapezoid per user input.
 */
import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {
        //Step 1: Take user input for trapezoid dimensions
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter base 1 of the trapezoid: ");
        double base1 = input.nextDouble();
        System.out.print(" Enter base 2 of the trapezoid: ");
        double base2 = input.nextDouble();
        System.out.print(" Enter height of the trapezoid: ");
        double height = input.nextDouble();

        //Step 2: Compute area of trapezoid
        double area = 0.5 * (base1 + base2) * height;

        //Step 3: Dispays the trapezoid area
        System.out.println(" A trapezoid with base 1 of " + base1
                + ", base 2 of " + base2 + ", and a height of " + height + " has an area of " + area);

    }

}
