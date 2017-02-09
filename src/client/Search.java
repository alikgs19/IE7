package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class Search {

    public String OriginCode;
    public String DestinationCode;
    public String Date;
    public String AdultCount;
    public String ChildCount;
    public String InfantCount;


    public static String GetSearchQuery() throws IOException {
        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));


        Search query = new Search();

        System.out.println("enter origin code : ");
        query.OriginCode = userInputBR.readLine();
        System.out.println("enter destination code : ");
        query.DestinationCode = userInputBR.readLine();
        System.out.println("enter the date: ");
        query.Date = userInputBR.readLine();
        System.out.println("enter number of adult persons : ");
        query.AdultCount = userInputBR.readLine();
        System.out.println("enter number of child persons : ");
        query.ChildCount = userInputBR.readLine();
        System.out.println("enter number of infant persons : ");
        query.InfantCount = userInputBR.readLine();

        String searchquery = "search " + query.OriginCode + " " + query.DestinationCode + " " + query.Date
                + " " + query.AdultCount + " " + query.ChildCount + " " + query.InfantCount;

        return searchquery;
    }
}
