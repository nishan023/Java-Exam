import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String msg = "Hello Server";
        byte[] buffer = msg.getBytes();

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ip, 5000);

        ds.send(dp);
        ds.close();
    }
}