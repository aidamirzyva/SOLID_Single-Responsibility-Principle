package solid;

public class EmailService {

    public void sendWelcomeEmail(User user) {
        System.out.println("Welcome email sent to " + user.getEmail());
    }

}
