package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class ReservationQuery {
    public String OriginCode;
    public String DestinationCode;
    public String AirlineCode;
    public String FlightNo;
    public String SeatClass;
    public int AdultCount;
    public int ChildCount;
    public int InfantCount;
    public String passengers = "";


    public ReservationQuery(String _OriginCode, String _DestinationCode, String _AirlineCode, String _FlightNo, String _SeatClass,
                            String _AdultCount, String _ChildCount, String _InfantCount, String _FirstName, String _Surname, String _NationalID){
        this.OriginCode = _OriginCode;
        this.DestinationCode = _DestinationCode;
        this.AirlineCode = _AirlineCode;
        this.FlightNo = _FlightNo;
        this.SeatClass = _SeatClass;
        this.AdultCount = Integer.parseInt(_AdultCount);
        this.ChildCount = Integer.parseInt(_ChildCount);
        this.InfantCount = Integer.parseInt(_InfantCount);


    }

    public int getPassengerCount (){
        return AdultCount + ChildCount + InfantCount;
    }

    public void addPassengerDetail(String PassengerDetail){
        passengers += PassengerDetail + "\n";
    }

    public String toString() {

        String reservationquery = "RES " + OriginCode +
                " " + DestinationCode +
                " " + AirlineCode +
                " " + FlightNo +
                " " + SeatClass +
                " " + AdultCount +
                " " + ChildCount +
                " " + InfantCount + "\n"
                + passengers;

        return reservationquery;
    }

}
