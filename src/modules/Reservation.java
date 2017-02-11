package modules;

/**
 * Created by Ali on 2/11/2017 AD.
 */
public class Reservation {

    public String originCode;
    public String destinationCode;
    public String airlineCode;
    public String flightNo;
    public char seatClass;
    public int adultCount;
    public int childCount;
    public int infantCount;
    public String passengers = "";
    public String token;

    public Reservation(String _Request){
        String[] splittedRequest = _Request.split("\\+s");
        this.originCode = splittedRequest[1];
        this.destinationCode = splittedRequest[2];
        this.airlineCode = splittedRequest[3];
        this.flightNo = splittedRequest[4];
        this.seatClass = splittedRequest[5].charAt(0);
        this.adultCount = Integer.parseInt(splittedRequest[6]);
        this.childCount = Integer.parseInt(splittedRequest[7]);
        this.infantCount = Integer.parseInt(splittedRequest[8]);
    }

    public String getPassengerOnIndex(int index){
        String[] splittedString = passengers.split("\\r?\\n");
        return splittedString[index];
    }

    public boolean isToken(String _Token){
        if (token.equals(_Token)){
            return true;
        }
        else return false;
    }

    public int getPassengerCount (){
        return adultCount + childCount + infantCount;
    }

    public void addToken(String _Token){
        token = _Token;
    }

    public void addPassengerDetail(String PassengerDetail){
        passengers += PassengerDetail + "\n";
    }


    public String toString(){
        String result = "";
        result += originCode + " " + destinationCode + " " + airlineCode + " " + flightNo + " " + seatClass;

        return  result;
    }

}
