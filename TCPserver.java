import java.io.*;
import java.net.*;

public class TCPserver {
    public static void main(String[] args) {
        int port = 8080;
        try(ServerSocket serverSocket = new ServerSocket(port);){
            System.out.println("Server Running......Waiting for Client");
            Socket socket = serverSocket.accept(); //accepting the client conection
            System.out.println("client Connected");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            String message = input.readLine();
            System.out.println("Received: " + message);
            output.println("Messege from Server!");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
