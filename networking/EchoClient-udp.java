import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName("localhost");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            byte[] buffer = new byte[1024];

            String message;
            while (true) {
                System.out.print("Enter message (or 'exit' to quit): ");
                message = br.readLine();
                if (message.equalsIgnoreCase("exit")) break;

                // Send message to server
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 12345);
                socket.send(sendPacket);

                // Receive response from server
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);
                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}