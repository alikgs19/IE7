package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class FinalizeBuying {
    public String Token;

    public static String GetFinalizeBuyingQuery() throws IOException {
        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));


        FinalizeTempBuying query = new FinalizeTempBuying();

        System.out.println("enter your token : ");
        query.Token = userInputBR.readLine();

        String buyingQuery = "finalaize " + query.Token;
        return buyingQuery;
    }
}
