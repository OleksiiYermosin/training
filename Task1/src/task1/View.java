package task1;

public class View {

    public static final String WELCOME_MESSAGE = "Input two words: 'Hello' and 'world!' to combine them. Type 'exit' for exit.";
    public static final String EMPTY_STRING = "String is empty, try again.";
    public static final String FIRST_STRING = "Type first word";
    public static final String SECOND_STRING = "Type second word";

    public void printMessage(String message){
        System.out.println(message);
    }
}
