package pl.sdacademy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket listener = new ServerSocket(666);
        System.out.println("Date server is running");

        while (true) {
            Socket socket = listener.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = bufferedReader.readLine();
            System.out.println(response);

            String[] s = response.split(" ");
            int result = 0;
            for (int i = 0; i < s.length; i++) {
                result += Integer.valueOf(s[i]);
            }


            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//        out.println(new Date().toString());
            out.println(result);
            socket.close();
        }
    }
}
