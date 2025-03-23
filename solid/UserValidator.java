package solid;

public class UserValidator {
    public boolean validate(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return false;
        }
        return true;
    }
}
