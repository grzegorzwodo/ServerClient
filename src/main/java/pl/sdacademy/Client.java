package pl.sdacademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = in.readLine();
        System.out.println("Server response: " + response);

    }

}

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
