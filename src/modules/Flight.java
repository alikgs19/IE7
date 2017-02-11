package modules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.*;
import java.util.ArrayList;

/**
 * Created by Ali on 2/10/2017 AD.
 */
public class Flight {
    public class SeatClass {
        public char seatClass;
        public char capacity;
        public ArrayList<Integer> prices;

        public SeatClass(String _SeatClass) {

            seatClass = _SeatClass.charAt(0);
            capacity = _SeatClass.charAt(1);

        }
    }


    private String airlineCode;
    private String flightNo;
    private String date;
    private String originCode;
    private String destinationCode;
    private String departureTime;
    private String arrivalTime;
    private String airplaneModel;
    private ArrayList<SeatClass> seatClasses;


    public Flight(String _Flight) {
        String[] flight = _Flight.split("\\+s");
        this.airlineCode = flight[0];
        this.flightNo = flight[1];
        this.date = flight[2];
        this.originCode = flight[3];
        this.destinationCode = flight[4];
        this.departureTime = flight[5];
        this.arrivalTime = flight[6];
        this.airplaneModel = flight[7];
    }

    public int getNumOfSeatClasses() {
        return seatClasses.size();
    }

    public String getOriginCode() {
        return originCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public SeatClass getSeatClass(int index) {
        return seatClasses.get(index);
    }


    private void addOneSeatClass(String _SeatClass) {
        SeatClass newSeatClass = new SeatClass(_SeatClass);
        seatClasses.add(newSeatClass);
        return;
    }

    public void addSeatClasses(String _SeatClasses) {
        String[] seatclasses = _SeatClasses.split("\\+s");

        for (int i = 0; i < seatclasses.length; i++) {
            addOneSeatClass(seatclasses[i]);
        }
    }

    public void addSeatClassPrice(int seatClassIndex, String _AdultPrice, String _ChilePrice, String _InfantPrice) {
        seatClasses.get(seatClassIndex).prices.add(Integer.parseInt(_AdultPrice));
        seatClasses.get(seatClassIndex).prices.add(Integer.parseInt(_ChilePrice));
        seatClasses.get(seatClassIndex).prices.add(Integer.parseInt(_InfantPrice));
    }

    public String toString(){
        String result = "";
        result += "Flight: " + airlineCode +
                " " + flightNo +
                " Departure: " + departureTime +
                " Arrival: " + arrivalTime +
                " Airplane: " + airlineCode + "\n";

        return result;
    }



}


