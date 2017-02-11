package modules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ali on 2/10/2017 AD.
 */
public class SearchQuery {
    public ArrayList<Flight> flights;
    public int adultCount;
    public int childCount;
    public int infantCount;

    public SearchQuery(ArrayList<Flight> _flights, int _adultCount, int _childcount, int _infantcount){
        flights = _flights;
        adultCount = _adultCount;
        childCount = _childcount;
        infantCount = _infantcount;
    }




    public int getSeatClassTotalPrice(Flight.SeatClass seatClass){

        int adultprice = seatClass.prices.get(0)*adultCount;
        int childprice = seatClass.prices.get(1)*childCount;
        int infantprice = seatClass.prices.get(2)*infantCount;

        return adultprice + childprice + infantprice;

    }

    public void getPriceForSearch (BufferedWriter out, BufferedReader in) throws IOException {
        String result = "";

        for(int i = 0; i< flights.size();i++) {
            Flight currentFlight = flights.get(i);
            int numOfSeatClasses = currentFlight.getNumOfSeatClasses();
            for (int j = 0; j < numOfSeatClasses; j++) {
                PriceQuery newPriceQuery = new PriceQuery(currentFlight, j);
                String query = newPriceQuery.toString();
                out.write(query);
                out.flush();

                String line;
                while ((line = in.readLine()) != null) {
                    String[] splittedString = line.split("\\+s");
                    currentFlight.addSeatClassPrice(i, splittedString[0], splittedString[1], splittedString[2]);
                }

            }

        }

    }


    public String getSearchResult(){

        String result = "";
        for (int i = 0; i < flights.size(); i++) {
            Flight currentFlight = flights.get(i);
            result += currentFlight.toString();
            Flight.SeatClass seatClass = currentFlight.getSeatClass(i);
            int seatClassTotalPrice = getSeatClassTotalPrice(seatClass);
            result += "Class: " + seatClass.seatClass + " " + Integer.toString(seatClassTotalPrice) + "\n";

            if (i < flights.size()){
                result += "***" + "\n";
            }
        }

        return  result;



    }

}
