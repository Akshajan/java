import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try (DatagramSocket serverSocket = new DatagramSocket(12345)) {
            System.out.println("UDP Server is listening on port 12345");

            byte[] buffer = new byte[1024];

            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                serverSocket.receive(packet); // Receive packet from client
                
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Client said: " + message);

                // Echo the message back to the client
                byte[] responseData = message.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, packet.getAddress(), packet.getPort());
                serverSocket.send(responsePacket); // Send response to client
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
