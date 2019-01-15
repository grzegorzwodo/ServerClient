package pl.sdacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
    public static void main( String[] args ) throws IOException {

        ServerSocket listener = new ServerSocket(9090);
        System.out.println("Date server is running");
        Socket socket = listener.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(new Date().toString());

    }
}
