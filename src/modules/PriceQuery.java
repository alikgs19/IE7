package modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class PriceQuery {
    public String originCode;
    public String destinationCode;
    public String airlineCode;
    public Flight.SeatClass seatClass;

//    public PriceQuery(String _OriginCode, String _DestinationCode, String _AirlineCode, String _SeatClass){
//        this.originCode = _OriginCode;
//        this.destinationCode = _DestinationCode;
//        this.airlineCode = _AirlineCode;
//        this.seatClass = _SeatClass;
//    }

    public PriceQuery(Flight newFlight, int seatClassIndex){
        this.originCode = newFlight.getOriginCode();
        this.destinationCode = newFlight.getDestinationCode();
        this.airlineCode = newFlight.getAirlineCode();
        this.seatClass = newFlight.getSeatClass(seatClassIndex);

    }

    public String getOriginCode(){
        return originCode;
    }
    public String getDestination(){
        return destinationCode;
    }
    public String getAirlineCode(){
        return airlineCode;
    }
    public String getSeatClass(){
        return seatClass;
    }
    public String toString(){
        String pricequery = "PRICE " + originCode + " " + destinationCode + " " + airlineCode + " " + seatClass;
        return pricequery;
    }
}
