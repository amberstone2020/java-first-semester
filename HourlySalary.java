package firstsemester;

/*
 * Amber Stone
 * 11.24.19
 * Description: This program creates a Java class called HourlySalary with specs
 * outlined in the comments below.
 */
public class HourlySalary {

    /*Define a static method called printSalary to print hourly salaries. The 
    * printSalary method should take a double array as an input.
     */
    public static void printSalary(double[] temp) {
        //print printSalary contents
        for (int i = 0; i < temp.length; i++) {
            System.out.printf("$%5.2f ", temp[i]);
        }
        System.out.println();
    }

    //instance method called averageSalary to return average hourly salary
    public double averageSalary(double[] test) {
        double sum = 0;
        for (int i = 0; i < test.length; i++) {
            sum = sum + test[i];
        }
        double average = sum / test.length;
        return average;
    }

    /*define an instance method called highestSalary to print the highest 
    * hourly salary
     */
    public double highestSalary(double[] test) {
        double max = test[0];
        for (int i = 1; i < test.length; i++) {
            //check if the current element is larger than the max
            if (test[i] > max) {
                max = test[i];
            }
        }
        return max;
    }

    /*define an instance method called lowestSalary to print the lowest 
    * hourly salary
     */
    public double lowestSalary(double[] test) {
        double min = test[0];
        for (int i = 1; i < test.length; i++) {
            //check if the current element is smaller than the max
            if (test[i] < min) {
                min = test[i];
            }
        }
        return min;
    }

    /*define an instance method called belowAverageSalary to return the number
    * of employees with less than the average hourly salary
     */
    public int belowAverageSalary(double[] test) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < test.length; i++) {
            sum = sum + test[i];
        }
        double average = sum / test.length;
        for (int i = 0; i < test.length; i++) {
            if (test[i] < average) {
                count++;
            }
        }

        return count;
    }
}
