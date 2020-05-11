package firstsemester;

/*
 * Amber Stone
 * Date: 11.24.19
 * Description: Create a test class called HourlySalaryTest to test the 
 * HourlySalary class. 
 */
import java.util.Scanner;

public class HourlySalaryTest {

    public static void main(String[] args) {
        int nums = 10;
        //takes user input for hourly salaries of 10 employees
        double[] numArray = new double[nums];
        //prompt user to enter 10 hourly salary values
        System.out.print("Enter the salaries of " + nums + " employees: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nums; i++) {
            numArray[i] = input.nextDouble();

        }
        //call printSalary method to print numArray
        HourlySalary.printSalary(numArray);
        //create an object of HourlySalary
        HourlySalary hs = new HourlySalary();
        //call averageSalary to print average of array elements
        double average = hs.averageSalary(numArray);
        System.out.printf("The average salary is: $" + "%.2f\n", average);
        //call highestSalary to print maximum element of numArray
        double max = hs.highestSalary(numArray);
        System.out.printf("The highest salary is: $" + "%.2f\n", max);
        //call findMin to print minimum element of numArray
        double min = hs.lowestSalary(numArray);
        System.out.printf("The lowest salary is: $" + "%.2f\n", min);
        //call belowAverage to print how many employees below the average salary
        int count = hs.belowAverageSalary(numArray);
        System.out.println("The number of employees with a below average salary"
                + " is: " + count);
    }

}


