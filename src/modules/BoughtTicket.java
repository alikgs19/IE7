package modules;

/**
 * Created by Ali on 2/11/2017 AD.
 */
public class BoughtTicket {
    public Reservation reservation;
    public Flight flight;
    public String firstName;
    public String surname;
    public String referenceCode;
    public String ticketNo;

    public BoughtTicket(Reservation _reservation, Flight _flight, String _person, String _referenceCode, String _ticketNo){
        String[] personInformation = _person.split("\\+s");
        firstName = personInformation[0];
        surname = personInformation[1];
        referenceCode = _referenceCode;
        ticketNo = _ticketNo;
        reservation = _reservation;
        flight = _flight;
    }

    public String toString(){

    }
}
