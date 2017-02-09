package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class TempReservation {
    public String OriginCode;
    public String DestinationCode;
    public String AirlineCode;
    public String FlightNo;
    public String SeatClass;
    public String AdultCount;
    public String ChildCount;
    public String InfantCount;


    public static String GetTempReservation() throws IOException {
        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));


        TempReservation query = new TempReservation();

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
        query.AdultCount = userInputBR.readLine();
        System.out.println("enter number of child persons : ");
        query.ChildCount = userInputBR.readLine();
        System.out.println("enter number of infant persons : ");
        query.InfantCount = userInputBR.readLine();

        String TempReservequery = "RES " + query.OriginCode + " " + query.DestinationCode + " " + query.AirlineCode + " " + query.FlightNo +  " " + query.SeatClass
                + " " + query.AdultCount + " " + query.ChildCount + " " + query.InfantCount;

        return TempReservequery;
    }

}
