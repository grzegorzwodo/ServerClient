package pl.sdacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        //Browser
        Socket socket = new Socket("sejm.gov.pl", 80);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("GET / HTTP/1.1");
        out.println("Host: sejm.gov.pl");
        out.println();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = "";
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

    }
}
