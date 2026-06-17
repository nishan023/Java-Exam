import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    public static void main(String[] args) {

        final String sender = "yourmail@gmail.com";
        final String password = "yourpassword";

        String receiver = "receiver@gmail.com";

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,
            new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(sender, password);
                }
            });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(sender));

            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(receiver)
            );

            message.setSubject("Test Mail");

            message.setText("Hello! This email is sent using Java Mail API.");

            Transport.send(message);

            System.out.println("Email Sent Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}