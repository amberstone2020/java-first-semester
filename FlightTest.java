package firstsemester;

/*
 * Amber Stone
 * 11.10.19
 * Description: Test class for Flight, with specs outlined in the comments 
 * below.
 */
public class FlightTest {

    public static void main(String[] args) {
        //defualt Flight object called flight1
        Flight flight1 = new Flight();
        //print description of the flight1 object
        System.out.println(flight1);
        //Flight object called flight2 with given data
        Flight flight2 = new Flight("UML", "U234", "Chicago", "London");
        //print description of the flight2 object
        System.out.println(flight2);
        //create a flight object called flight3 withgiven data
        Flight flight3 = new Flight("Java", "J817", "Atlanta", "Paris");
        //print description of the flight3 object
        System.out.println(flight3);
        //print the number of flight objects created
        System.out.println("Flight Count: " + Flight.getFlightCount());
    }
}

