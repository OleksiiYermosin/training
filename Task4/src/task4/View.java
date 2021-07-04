package task4;

/**
 * Class that represents information
 * @author Oleksii Yermosin
 * @version 1.0
 * @see Model
 * @see Controller
 */
public class View {

    public static final String INCORRECT_DATA_MESSAGE = "\tIncorrect data, please try again.";
    public static final String SURNAME_PROMPT = "Write your surname.";
    public static final String NICK_PROMPT = "Write your nickname. Nickname can contain latin letters, numbers, '_' and '-'.\n" +
            "Length of nickname must be at least 4 symbols, maximum length is 25.";
    public static final String SURNAME_MESSAGE = "Surname: ";
    public final static String NICK_MESSAGE = "Nickname: ";

    /**
     * Method that prints messages
     * @param message - message that need to be printed
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}
