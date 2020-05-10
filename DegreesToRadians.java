package firstsemester;

   /*
 * Amber Stone
 * 10.09.19
 * Description: This program converts the angles 20, 40, 60 and 80 from degrees 
 * to radians and computes their sines, cosines, and tangents. Displays the 
 * formatted output in a table.
 */
public class DegreesToRadians {

    public static void main(String[] args) {
        //display header of the table
        System.out.println("*********************");
        System.out.printf("%-10s%-10s\n", "Degrees", "Radians");
        System.out.println("*********************");

        int degrees = (0);
        double radians = Math.toRadians(degrees);

        //Display values for 20 degrees
        degrees = 20;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10s%-10.3f\n", degrees, radians);

        //Display values for 40 degrees
        degrees = 40;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10s%-10.3f\n", degrees, radians);

        //Display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10s%-10.3f\n", degrees, radians);

        //Display values for 80 degrees
        degrees = 80;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10s%-10.3f\n", degrees, radians);

        System.out.println("*********************");

        //display header
        System.out.println("=================================================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Angles", "20",
                "40", "60", "80");
        System.out.println("=================================================");

        //display values for 20 degrees

        //values for 
        System.out.printf("%-10s%-10.3f%-10.3f%-10.3f%-10.3f\n", "Sine ",
                Math.sin(Math.toRadians(20)), Math.sin(Math.toRadians(40)),
                Math.sin(Math.toRadians(60)), Math.sin(Math.toRadians(80)));

        System.out.printf("%-10s%-10.3f%-10.3f%-10.3f%-10.3f\n", "Cosine ",
                Math.cos(Math.toRadians(20)), Math.cos(Math.toRadians(40)),
                Math.cos(Math.toRadians(60)), Math.cos(Math.toRadians(80)));

        System.out.printf("%-10s%-10.3f%-10.3f%-10.3f%-10.3f\n", "Tangent ",
                Math.tan(Math.toRadians(20)), Math.tan(Math.toRadians(40)),
                Math.tan(Math.toRadians(60)), Math.tan(Math.toRadians(80)));

        System.out.println("=================================================");
    }
}
 
