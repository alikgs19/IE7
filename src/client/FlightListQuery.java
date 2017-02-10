package client;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class FlightListQuery {
    public String OriginCode;
    public String DestinationCode;
    public String Date;

    public FlightListQuery(String _OriginCode, String _DestinationCode, String _Date){
        this.OriginCode = _OriginCode;
        this.DestinationCode = _DestinationCode;
        this.Date = _Date;
    }

    public String getOriginCode(){
        return OriginCode;
    }

    public String getDestinationCode(){
        return DestinationCode;
    }

    public String getDate(){
        return Date;
    }

    public String toString()  {

        String flightlistquery = "AV " + OriginCode + " " + DestinationCode + " " + Date;
        return flightlistquery;

    }

}
