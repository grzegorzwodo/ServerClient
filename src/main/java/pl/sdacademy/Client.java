package pl.sdacademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the IP address of a machine running the date server:");
        String serverAddress = new Scanner(System.in).nextLine();
        Socket socket = new Socket(serverAddress, 666);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String numbers = new Scanner(System.in).nextLine();
        out.println(numbers);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = in.readLine();
        System.out.println("Server response: " + response);

    }

}
