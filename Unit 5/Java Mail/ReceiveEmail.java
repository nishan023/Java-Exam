import java.util.Properties;
import javax.mail.*;

public class ReceiveEmail {

    public static void main(String[] args) throws Exception {

        String user = "yourmail@gmail.com";
        String password = "yourpassword";

        Properties props = new Properties();

        props.put("mail.store.protocol", "imaps");

        Session session = Session.getDefaultInstance(props);

        Store store = session.getStore("imaps");

        store.connect("imap.gmail.com", user, password);

        Folder inbox = store.getFolder("INBOX");

        inbox.open(Folder.READ_ONLY);

        Message messages[] = inbox.getMessages();

        for (int i = 0; i < messages.length; i++) {
            System.out.println("Subject: " + messages[i].getSubject());
        }

        inbox.close(false);
        store.close();
    }
}