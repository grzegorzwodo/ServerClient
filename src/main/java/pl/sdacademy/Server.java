package pl.sdacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //odczytaj od klienta ciag liczb ( 5 6 7 8 9)
        String numbers = in.readLine();
        System.out.println(numbers);

        //"5 6 7 8".split(" ") podzel stringa na liczby
        //i zsumuj je
        String[] tab = numbers.split(" ");
        int sum = 0;
        for (String s : tab) {
            int val = Integer.parseInt(s);
            sum +=val;
        }

        //wyslij wynik do klienta
        out.println(sum);

        //out.println(new Date().toString());

    }
}
