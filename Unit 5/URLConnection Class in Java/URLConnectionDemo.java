import java.net.*;
import java.io.*;

public class URLConnectionDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");

        URLConnection conn = url.openConnection();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}