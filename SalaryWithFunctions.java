package firstsemester;

/*
 * Amber Stone
 * 11.23.19
 * Description: This program creates a class called SalaryWithFunctions to meet the specs 
 * outlined in the comments.
 */
public class SalaryWithFunctions {

    public static void main(String[] args) {
        //randomly generate numbers be in the range of $12.00 to $75.00, 
        //inclusive and store in an array
        double[] salaryArray = new double[8];
        salaryArray[0] = 1.0;
        salaryArray[1] = 2.0;
        salaryArray[2] = 3.0;
        salaryArray[3] = 4.0;
        salaryArray[4] = 5.0;
        salaryArray[5] = 6.0;
        salaryArray[6] = 7.0;
        salaryArray[7] = 8.0;

        //assign random values to array
        for (int i = 0; i < salaryArray.length; i++) {
            salaryArray[i] = (double) (Math.random() * 64) + 12;
        }
        //print salaryArray contents
        for (int i = 0; i < salaryArray.length; i++) {
            System.out.printf("$%5.2f ", salaryArray[i]);
        }
        System.out.println();

        //change the hourly salary to $55.00 for the employee with ID 5. 
        salaryArray[5] = 55.00;
        /*in place for testing
        * for(int i = 0; i < salaryArray.length; i++){
        * System.out.printf(salaryArray[i] + " ");
        * }
         */

        //finding max salary
        int ID = 0;
        double max = salaryArray[0];
        for (int i = 1; i < salaryArray.length; i++) {
            //check if the current element is bigger than the max
            if (salaryArray[i] > max) {
                max = salaryArray[i];
            }
            if (max == salaryArray[i]) {
                ID = i;
            }
        }
        //print salary and employee ID of the employee with highest hourly salary
        System.out.printf("The employee with ID " + ID + " has the highest hourly salary of $" + "%.2f\n", max);

        //find the min salary
        double min = salaryArray[0];
        for (int i = 1; i < salaryArray.length; i++) {
            //check if the current element is smaller than the max
            if (salaryArray[i] < min) {
                min = salaryArray[i];
            }
            if (min == salaryArray[i]) {
                ID = i;
            }
        }
        //print salary and employee ID of the employee with lowest hourly salary
        System.out.printf("The employee with ID " + ID + " has the lowest hourly salary of $" + "%.2f\n", min);
        //print the difference between the highest and lowest hourly salaries.
        double diff = max - min;
        System.out.printf("The difference between the highest salary and lowest "
                + "salary is: $" + "%.2f\n", diff);

        //compute number of employees with salaries higher than the national average
        int count = 0;
        double averageSalary = 22.00;
        for (int i = 0; i < salaryArray.length; i++) {
            if (salaryArray[i] > averageSalary) {
                count++;
            }
        }
        //print num of employees with hourly salary above the national average
        System.out.println("The number of employees that earn a hourly salary "
                + "above the national average is: " + count);
    }
}

