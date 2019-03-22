package networking;

import java.io.*;
import java.net.*;

public class Server {

    public Server() {
        try {
            //creating server socket binding at port #3000
            ServerSocket server = new ServerSocket(3000);
            System.out.println("server binded at " + ((server.getInetAddress().getLocalHost()).getHostAddress() + ":3000"));
            System.out.println("Run the Client");
            //ready to accept client request
            Socket socket = server.accept();
            //opening the input stream to read data from client Connection
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
            //using output stream responsing data
            PrintStream out = new PrintStream(socket.getOutputStream());
            out.print("welcome by server\n");
            out.flush();
            //closing the in and out streams
            out.close();
            in.close();
        } catch (Exception err) {
            System.out.println("* Err" + err);
        }

    }

    public static void main(String[] args) {
        new Server();
    }
}
