import java.util.Arrays;

import Interface.Flight;
import Interface.Passenger;

/**
 * General
 */
public class General {

    public static void main(String[] args) {
        // person1 for passenger interface
        Passenger bob = new Passenger();
        bob.setLevelAndDays(1, 180);
        // person2
        Passenger jane = new Passenger();
        bob.setLevelAndDays(1, 90);
        // person3
        Passenger steve = new Passenger();
        bob.setLevelAndDays(2, 180);
        // person4
        Passenger lisa = new Passenger();
        bob.setLevelAndDays(3, 730);

        Passenger[] passengers = { bob, jane, steve, lisa };
        Arrays.sort(passengers);

        System.out.println(passengers[0].getMemberdays());

        // separator
        System.out.println("==========>");
        // flight time interface
        Flight lax045 = new Flight();
        lax045.setFlightTime(45);
        Flight slc015 = new Flight();
        slc015.setFlightTime(15);
        Flight nyc030 = new Flight();
        nyc030.setFlightTime(30);

        Flight[] flights = { lax045, slc015, nyc030 };

        Arrays.sort(flights);
        System.out.println(flights[0].getFlightTime());
    }
}