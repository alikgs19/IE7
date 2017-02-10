package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class PriceQuery {
    public String OriginCode;
    public String DestinationCode;
    public String AirlineCode;
    public String SeatClass;

    public PriceQuery(String _OriginCode, String _DestinationCode, String _AirlineCode, String _SeatClass){
        this.OriginCode = _OriginCode;
        this.DestinationCode = _DestinationCode;
        this.AirlineCode = _AirlineCode;
        this.SeatClass = _SeatClass;
    }

    public String getOriginCode(){
        return OriginCode;
    }
    public String getDestination(){
        return DestinationCode;
    }
    public String getAirlineCode(){
        return AirlineCode;
    }
    public String getSeatClass(){
        return SeatClass;
    }
    public String toString(){
        String pricequery = "PRICE " + OriginCode + " " + DestinationCode + " " + AirlineCode + " " + SeatClass;
        return pricequery;
    }
}
