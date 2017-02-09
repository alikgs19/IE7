package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketMain {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        System.out.println("accept!");
        Socket socket = server.accept();

        int count = 10;
        while (count > 0){
            count = count -1;
            int c = socket.getInputStream().read();
            System.out.println("client: " + c);
        }
        server.close();
    }
}
