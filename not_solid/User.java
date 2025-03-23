package not_solid;

public class User {
    private String name;
    private String email;

    public boolean validate() {
        if (!email.contains("@")) {
            return false;
        }
        return true;
    }

    public void saveToDatabase() {
        System.out.println("User saved to database");
    }

    public void sendWelcomeEmail() {
        System.out.println("Welcome email sent to " + email);
    }
}