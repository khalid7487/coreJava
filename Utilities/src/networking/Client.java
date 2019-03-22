package networking;

import java.io.*;
import java.net.*;

public class Client {

    public Client() {
        //creating the socket  to connect to server running on same machine   
        try {
            Socket client = new Socket("localhost", 3000);
            System.out.println("Client connected ");
            //getting the o/p stream of that connection
            PrintStream out=new PrintStream(client.getOutputStream());
            //sending the message to server
            out.print("Hello from client\n");
            out.flush();
            //reading the response using input stream
            BufferedReader in =new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println(in.readLine());
            //closing the streams
            in.close();
            out.close();
        }catch(Exception err){
            System.out.println("*err:"+err);
        }
    }
public static void main(String[] args) {
        new Client();
    }
}
