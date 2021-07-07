package task5.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
                    //new Locale("en"));        // English

    /**
     * Method that prints message
     * @param message - message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method that returns decoded string
     * @param message - encoded string
     * @return decoded string
     */
    public String getRealString(String message){
        return bundle.getString(message);
    }
}
