package pl.sdacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the IP address of a machine running the date server:");

        String serverAddress = new Scanner(System.in).nextLine();
        Socket socket = new Socket(serverAddress, 9090);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //wyslij do server podane liczby "5 5 6 128"
        System.out.println("Podaj liczby: ");
        String numbers = new Scanner(System.in).nextLine();
        out.println(numbers);

        //wyswietl otrzymynay wynik
        System.out.println(in.readLine());












        /* //Browser
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
        */
    }

}
