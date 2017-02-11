package modules;


import java.util.ArrayList;

/**
 * Created by Ali on 2/11/2017 AD.
 */
public class BuyingProcess {

    public ArrayList<Reservation> reservations;
    public ArrayList<BuyingTickets> buyingTickets;

    public BuyingProcess(){}

    public void addReservation(Reservation newReservation){
        reservations.add(newReservation);
    }

    public Reservation getReservation(String token) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).isToken(token)) {
                return reservations.get(i);
            }
            return null;
        }
    }

    public void addReserveToBought(Reservation _newReserve){}
    public void finalizeToken(String _Token){
        for (int i = 0; i < reservations.size(); i++) {

            if (reservations.get(i).isToken(_Token)){
                Reservation boughtTicket = reservations.get(i);
                reservations.remove(i);
                addReserveToBought(boughtTicket);
            }

        }
    }
}
