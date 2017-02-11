package modules;

import client.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class ReservationQuery {
    public Reservation reservation;
    public int adultPrice;
    public int childPrice;
    public int infantPrice;



    public ReservationQuery(Reservation _reservation){
        Reservation reservation = _reservation;
    }

    public int totalPrice(String _adultPrice, String _childPrice, String _infantPrice){
        int adultPrice = Integer.parseInt(_adultPrice);
        int childPrice = Integer.parseInt(_childPrice);
        int infantPrice = Integer.parseInt(_infantPrice);

        int totalPrice = reservation.adultCount*adultPrice + reservation.childCount*childPrice + reservation.infantCount*infantPrice;
        return totalPrice;

    }

    public String toString() {

        String reservationquery = "RES " + reservation.originCode +
                " " + reservation.destinationCode +
                " " + reservation.airlineCode +
                " " + reservation.flightNo +
                " " + reservation.seatClass +
                " " + reservation.adultCount +
                " " + reservation.childCount +
                " " + reservation.infantCount + "\n"
                + reservation.passengers;

        return reservationquery;
    }

}
