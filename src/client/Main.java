package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Ali on 2/9/2017 AD.
 */
public class Main {
    public static void main(String[] args) throws IOException ,ClassNotFoundException {

        String airplaneServerIP = "188.166.78.119";
        String airplaneServerPort = "8081";
        Socket airplaneServerSocket=null;
        BufferedReader in = null;
        BufferedWriter out = null ;

        airplaneServerSocket = new Socket(airplaneServerIP, Integer.parseInt(airplaneServerPort));
        in = new BufferedReader(new InputStreamReader(airplaneServerSocket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(airplaneServerSocket.getOutputStream()));



        String line;
        out.write("AV THR MHD 05Feb");
        out.write("\n");
//        out.flush();

        while(((line = in.readLine()) != null)){
            System.out.println(line.toString());
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
//        BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));
//
//        boolean exit = false;
//        while (!exit){
//
//
//            System.out.println();
//            System.out.println("L for List query :");
//            System.out.println("P for Price query :");
//            System.out.println("R for Reservation :");
//            System.out.println("T for Finalize Temp Reservation:");
//            System.out.println("S for Search query:");
//            System.out.println("Q for Reservation query :");
//            System.out.println("F for Finalize Buying:");
//            System.out.println("E for Exit :");
//            System.out.println();
//
//            String query;
//            switch (userInputBR.readLine()){
//                case "l":
//                case "L":
//                    query = Listquery.GetListItemsQuery();
//                    System.out.println(query);
//                    break;
//                case "p":
//                case "P":
//                    query = Pricequery.GetPriceQuery();
//                    System.out.println(query);
//                    break;
//
//                case "R":
//                case "r":
//                    query = TempReservation.GetTempReservationQuery();
//                    System.out.println(query);
//                    break;
//
//                case "t":
//                case "T":
//                    query = FinalizeTempBuying.GetFinalizeTempBuyingQuery();
//                    System.out.println(query);
//                    break;
//
//                case "s":
//                case "S":
//                    query = Search.GetSearchQuery();
//                    System.out.println(query);
//                    break;
//
//                case "q":
//                case "Q":
//                    query = Reservation.GetReservationQuery();
//                    System.out.println(query);
//                    break;
//
//                case "f":
//                case "F":
//                    query = FinalizeBuying.GetFinalizeBuyingQuery();
//                    System.out.println(query);
//                    break;
//
//
//                case "e":
//                case "E":
//                    exit = true;
//                    break;
//
//
//            }
//        }

    }


}

