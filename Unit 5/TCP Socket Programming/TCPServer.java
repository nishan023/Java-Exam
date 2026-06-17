import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting...");

        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        String msg = dis.readUTF();

        System.out.println("Client says: " + msg);

        ss.close();
    }
}