package firstsemester;

/*
 * Amber Stone
 * 11.10.19
 * Description: This program designs a class called Flight to represent an 
 * airline flight. The class contains the specs outlined in the comments below.
 */
public class Flight {

    /* instance data to represent airline name, flight number, flight origin 
    city, and flight destination city*/
    private String airlineName;
    private String flightNum;
    private String departCity;
    private String destinCity;
    //static variable to keep track of the total number of flights created
    public static int flightCount = 0;

    //a no-argument constructor to create a default flight 
    public Flight() {
        this(" Delta", " D332", " Atlanta", " Key West");
    }

    /* constructor to create a flight with the airline name, flight number, 
    flight origin city, and flight destination city.*/
    public Flight(String airlineName, String flightNum, String departCity,
            String destinCity) {
        this.airlineName = airlineName;
        this.flightNum = flightNum;
        this.departCity = departCity;
        this.destinCity = destinCity;
        flightCount++;
    }

    //getter and setter methods for all instance data 
    public String getAirlineName() {
        return airlineName;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDepartCity() {
        return departCity;
    }

    public String getDesinCity() {
        return destinCity;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setDepartCity(String departCity) {
        this.departCity = departCity;
    }

    public void setDestinCity(String destinCity) {
        this.destinCity = destinCity;
    }

    public static void setFlightCount(int flightCount) {
        Flight.flightCount = flightCount;
    }

    //toString method to return the description of a flight
    @Override
    public String toString() {
        String output = "\nFlight Description: \n";
        output += "Airline Name: " + airlineName;
        output += "\nFlight Number: " + flightNum;
        output += "\nFlight Origin City: " + departCity;
        output += "\nFlight Destination City: " + destinCity;
        return output;
    }

    //static method to return the total number of flights created
    public static int getFlightCount() {
        return flightCount;
    }
}
