package firstsemester;

/*
 * Amber Stone
 * 10.16.19
 * Description: This program computes meters to feet and feet to meters in a 
 * side by side table per specified numbers given.
 */
public class MetersToFeetToMeters {

    public static void main(String[] args) {

        int feet = 40;

        // constant computations
        final double METERS_TO_FEET = 1 * 3.2808;
        final double FEET_TO_METERS = 1 * 0.3048;

        // displays table header
        System.out.printf("%-13s%-13s%-10s%-13s%-10s\n", "Meters", "Feet",
                "|", "Feet", "Meters");

        // loops through computations and displays results in formatted table
        for (int count = 7; count <= 107; count = count + 10) {
            {

                feet = feet + 10;

                System.out.printf("%-13s%-13.2f%-10s%-13s%-10.2f\n", count,
                        METERS_TO_FEET * count, "|", feet, FEET_TO_METERS
                        * feet);

            }
        }

    }
}
