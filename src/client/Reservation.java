package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/10/2017 AD.
 */
public class Reservation {
    public String OriginCode;
    public String DestinationCode;
    public String AirlineCode;
    public String FlightNo;
    public String SeatClass;
    public int AdultCount;
    public int ChildCount;
    public int InfantCount;
    public String FirstName;
    public String Surname;
    public String NationalID;



    public static String GetReservationQuery() throws IOException {
        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));


        Reservation query = new Reservation();

        System.out.println("enter origin code : ");
        query.OriginCode = userInputBR.readLine();
        System.out.println("enter destination code : ");
        query.DestinationCode = userInputBR.readLine();
        System.out.println("enter Airline code : ");
        query.AirlineCode = userInputBR.readLine();
        System.out.println("enter Flight number : ");
        query.FlightNo = userInputBR.readLine();
        System.out.println("enter seat class : ");
        query.SeatClass = userInputBR.readLine();
        System.out.println("enter number of adult persons : ");
        query.AdultCount = Integer.parseInt(userInputBR.readLine());
        System.out.println("enter number of child persons : ");
        query.ChildCount = Integer.parseInt(userInputBR.readLine());
        System.out.println("enter number of infant persons : ");
        query.InfantCount = Integer.parseInt(userInputBR.readLine());

        String Reservequery = "reserve " + query.OriginCode + " " + query.DestinationCode + " " + query.AirlineCode + " " + query.FlightNo +  " " + query.SeatClass
                + " " + query.AdultCount + " " + query.ChildCount + " " + query.InfantCount + "\n";

        for (int i = 0; i < query.AdultCount + query.ChildCount + query.InfantCount; i++) {

            System.out.println("=== enter first name :");
            query.FirstName= userInputBR.readLine();
            System.out.println("=== enter surname :");
            query.Surname = userInputBR.readLine();
            System.out.println("=== enter NationalID :");
            query.NationalID = userInputBR.readLine();

            System.out.println("--------------");
            Reservequery = Reservequery + query.FirstName + " " + query.Surname + " " + query.NationalID + "\n";

        }

        return Reservequery;
    }
}
