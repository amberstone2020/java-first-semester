package firstsemester;

/*
 * Amber Stone
 * 10.27.19
 * Description: This program takes three integers from the user and 
 * utilizes a method to sort and display the numbers in decreasing order.
 */
import java.util.Scanner;

public class IntegerSortDescending {

    public static void main(String[] args) {
        //takes user input for three integer values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer values: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(int one, int two, int three) {
        //numbers are sorted and displayed
        if (one > two && two > three) {
            System.out.println("The sorted numbers in decreasing order are: "
                    + one + " " + two + " " + three);
        } else if (two > one && one > three) {
            System.out.println("The sorted numbers in decreasing order are: "
                    + two + " " + one + " " + three);
        } else if (three > two && two > one) {
            System.out.println("The sorted numbers in decreasing order are: "
                    + three + " " + two + " " + one);
        } else if (two > three && three > one) {
            System.out.println("The sorted numbers in decreasing order are: "
                    + two + " " + three + " " + one);
        } else if (three > one && one > two) {
            System.out.println("The sorted numbers in decreasing order are: "
                    + three + " " + one + " " + two);
        } else {
            System.out.println("The sorted numbers in decreasing order are: "
                    + one + " " + three + " " + two);
        }

    }

}
