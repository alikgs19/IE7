package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class Listquery {
    public String OriginCode;
    public String DestinationCode;
    public String Date;


    public static String GetListItems() throws IOException {

        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));


        Listquery query = new Listquery();

        System.out.println("enter origin code : ");
        query.OriginCode = userInputBR.readLine();
        System.out.println("enter destination code : ");
        query.DestinationCode = userInputBR.readLine();
        System.out.println("enter date : ");
        query.Date = userInputBR.readLine();

        String listquery = "AV " + query.OriginCode + " " + query.DestinationCode + " " + query.Date;
        return listquery;

    }

}
