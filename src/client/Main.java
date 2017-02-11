package client;

import modules.*;
import org.omg.CORBA.ServerRequest;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class Main {
    public static void main(String[] args) throws IOException ,ClassNotFoundException {



        System.out.println("Welcome :)");
        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));

        BuyingProcess buyingProcess = new BuyingProcess();

        while (true) {

            String userInput = userInputBR.readLine();
            String response = requestHandler(userInput);
            System.out.println(response);

//            out.write(request);
//            out.flush();
        }
    }

    private static String requestHandler(String userInput, BuyingProcess buyingProcess) throws IOException {

        String airplaneServerIP = "188.166.78.119";
        String airplaneServerPort = "8081";
        Socket airplaneServerSocket = null;

        try {

            airplaneServerSocket = new Socket(airplaneServerIP, Integer.parseInt(airplaneServerPort));
            BufferedReader in = new BufferedReader(new InputStreamReader(airplaneServerSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(airplaneServerSocket.getOutputStream()));
            String[] splittedInput = userInput.split("\\s+");
            BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));

            if ("reserve".equals(splittedInput[0])){
                Reservation newReserve = new Reservation(userInput);

                for (int i = 0; i < newReserve.getPassengerCount() ; i++) {
                    newReserve.addPassengerDetail(userInputBR.readLine());
                }

                ReservationQuery newReservationQuery = new ReservationQuery(newReserve);
                // bayad khat be khat send beshe
                out.write(newReservationQuery.toString());
                out.flush();

                String[] serverResponse = in.readLine().split("\\+s");

                newReserve.addToken(serverResponse[0]);
                buyingProcess.addReservation(newReserve);
                int totalPrice = newReservationQuery.totalPrice(serverResponse[1], serverResponse[2], serverResponse[3]);


                String response = serverResponse[0] + Integer.toString(totalPrice);
                return response;
            }

            else if ("search".equals(splittedInput[0])) {
                FlightListQuery flightList = new FlightListQuery(userInput);
                out.write(flightList.toString());
                out.flush();

                ArrayList<Flight> flights = new ArrayList<Flight>();
                String line;
                while ( (line = in.readLine()) != null) {
                    Flight newFlight = new Flight(line);
                    line = in.readLine();
                    newFlight.addSeatClasses(line);
                    flights.add(newFlight);
                }

                int adultCount = Integer.parseInt(splittedInput[5]);
                int childCount = Integer.parseInt(splittedInput[6]);
                int infantCount = Integer.parseInt(splittedInput[7]);
                SearchQuery searchQuery = new SearchQuery(flights, adultCount, childCount, infantCount);

                searchQuery.getPriceForSearch(out, in);
                String searchResult = searchQuery.getSearchResult();
                System.out.println(searchResult);

            }

            else if ("finalize".equals(splittedInput[0])) {
                FinalizeQuery finalizeQuery = new FinalizeQuery(splittedInput[1]);
                out.write(finalizeQuery.toString());
                out.flush();

                Reservation finalizeReservation = buyingProcess.getReservation(splittedInput[1]);

                String line;
                while ( (line = in.readLine()) != null) {

                }
            }

        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}








//        final String host = "188.166.78.119";
//        final int portNumber = 8081;
//        System.out.println("Creating socket to '" + host + "' on port " + portNumber);
//        Socket socket = new Socket(host, portNumber);

//        OutputStream myOutput  = socket.getOutputStream();
//        PrintWriter out = new PrintWriter(myOutput, true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//        while (true){
//
//            BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));
//            String userInput = userInputBR.readLine();
//            System.out.println("alk");
//            System.out.println("client: " + userInput);
//            out.print(userInput);
//            if (in.ready())
//            {
//                System.out.println("Server: " + in.readLine());
//            }
//
//            System.out.println("Server: " + socket.getInputStream().read());
//
//            if ("exit".equalsIgnoreCase(userInput))
//            {
//                socket.close();
//                break;
//            }
//        }


}

