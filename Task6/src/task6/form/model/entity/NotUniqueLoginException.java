package task6.form.model.entity;

public class NotUniqueLoginException extends Exception{

    private final String notUniqueLogin;

    public String getNotUniqueLogin() {
        return notUniqueLogin;
    }

    public NotUniqueLoginException(String message, String login){
        super(message);
        notUniqueLogin = login;
    }
}
