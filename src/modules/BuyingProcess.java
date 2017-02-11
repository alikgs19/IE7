package modules;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ali on 2/11/2017 AD.
 */
public class BuyingProcess {

    public ArrayList<Reservation> reservations;
    public ArrayList<BoughtTicket> boughtTickets;

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

    public void finalizeBuying(BufferedWriter out, BufferedReader in, String _Token) throws IOException {

        String line;
        String referenceCode = in.readLine();
        Reservation reservation = getReservation(_Token);

        while ( (line = in.readLine()) != null) {
            for (int i = 0; i < reservation.getPassengerCount(); i++) {

                BoughtTicket boughtTicket = new BoughtTicket(reservation, reservation.getPassengerOnIndex(i), referenceCode, _Token);
                boughtTickets.add(boughtTicket);
                System.out.println(boughtTicket.toString());
            }
        }

    }
}
