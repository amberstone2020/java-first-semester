package firstsemester;

import java.util.Scanner;

/*
 * Amber Stone
 * 10.13.19
 * Description: This program takes user input for an amount of integers and 
 * returns the number of integers, the number of odd integers, the largest 
 * integer, the average of even integers, and the average of odd integers.
 */
public class IntegerFun {

    public static void main(String[] args) {
        // take user input for an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of integers: ");

        int size = input.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        int oddNum = 0;
        int evenNum = 0;
        double avgEvn;
        double avgOdd;
        int i;
        int num;
        int max = 0;

        // Generates random numbers based on user input
        for (i = 0; i < size; i++) {
            num = (int) (1 + Math.random() * 10);
            System.out.print(num + " ");
            if (num % 2 == 0) {
                sumEven = sumEven + num;
                evenNum++;
            } else {
                sumOdd = sumOdd + num;
                oddNum++;
            }
            if (num > max) {
                max = num;

            }

        }
        //Display values
        System.out.println("\nNumber of even integers is: " + evenNum);
        System.out.println("Number of odd integers is: " + oddNum);
        System.out.println("The largest integer is: " + max);

        avgEvn = sumEven / (evenNum * 1.0);
        avgOdd = sumOdd / (oddNum * 1.0);

        System.out.printf("Average of even integers is: %.2f\n", avgEvn);
        System.out.printf("Average of odd integers is: %.2f\n", avgOdd);

    }

}
