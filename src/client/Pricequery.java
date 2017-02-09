package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class Pricequery {
    public String OriginCode;
    public String DestinationCode;
    public String AirlineCode;
    public String SeatClass;


    public static String GetPriceQuery() throws IOException {
        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));


        Pricequery query = new Pricequery();

        System.out.println("enter origin code : ");
        query.OriginCode = userInputBR.readLine();
        System.out.println("enter destination code : ");
        query.DestinationCode = userInputBR.readLine();
        System.out.println("enter Airline code : ");
        query.AirlineCode = userInputBR.readLine();
        System.out.println("enter seat class : ");
        query.SeatClass = userInputBR.readLine();

        String pricequery = "PRICE " + query.OriginCode + " " + query.DestinationCode + " " + query.AirlineCode + " " + query.SeatClass;
        return pricequery;
    }
}
