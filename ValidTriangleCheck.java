package firstsemester;

/*
 * Amber Stone
 * 10.27.19
 * Description: This program takes user input for three double-valued sides and 
 * computes and returns the area if the triangle is valid. Otherwise, it outputs
 * the sides do not make a valid triangle. 
 */
import java.util.Scanner;

public class ValidTriangleCheck {

    public static void main(String[] args) {
        //take user input for three sides with double-values
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle as double values: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        //display results
        if ((isValidTriangle(side1, side2, side3)) == true) {
            System.out.printf("The area of the triangle is: %.2f\n", area(side1, side2, side3));
        } else {
            System.out.println("The sides do not make a valid triangle.");
        }
    }

    //boolean method to return triangle validity
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        if (side1 + side2 > side3
                && side2 + side3 > side1
                && side1 + side3 > side2) {
            return true;
        } else {
            return false;
        }
    }

    //computes area of valid triangle
    public static double area(double side1, double side2, double side3) {
        double area;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
