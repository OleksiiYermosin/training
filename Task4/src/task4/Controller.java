package task4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Class that updates <b>view</b> and manipulates <b>model</b>.
 * @author Oleksii Yermosin
 * @version 1.0
 * @see Model
 * @see View
 */
public class Controller {

    /**
     * Field that stores model`s link
     */
    private final Model model;

    /**
     * Field that stores view`s link
     */
    private final View view;

    /**
     * Constructor of class Controller
     * @param model - link on model`s object
     * @param view - link on view`s object
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Method that write determined data in model fields
     * @see Controller#getData(Scanner, String)
     */
    public void readData(){
        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.SURNAME_PROMPT);
        model.setSurname(getData(scanner, RegularExpressions.surnameRegEx));
        view.printMessage(View.NICK_PROMPT);
        model.setNickname(getData(scanner, RegularExpressions.nickRegEx));
        scanner.close();
    }

    /**
     * Method that check is given data correct
     * @param scanner - object of class Scanner
     * @param regEx - pattern of regular expression
     * @return data that satisfies given pattern
     * @see Controller#getLine(Scanner)
     * @see Controller#readData()
     */
    private String getData(Scanner scanner, String regEx){
        String inputData;
        Pattern pattern = Pattern.compile(regEx);
        while(true){
            inputData = getLine(scanner);
            if(!pattern.matcher(inputData).matches()){
                view.printMessage(View.INCORRECT_DATA_MESSAGE);
                continue;
            }
            break;
        }
        return inputData;
    }

    /**
     * Method that read data from command line
     * @param scanner - object of class Scanner
     * @return data that was read from command line
     * @see Controller#readData()
     * @see Controller#getData(Scanner, String)
     */
    private String getLine(Scanner scanner){
        while(!scanner.hasNextLine()){
            view.printMessage(View.INCORRECT_DATA_MESSAGE);
            scanner.next();
        }
        return scanner.nextLine();
    }

    /**
     * Method that output surname and nickname, which stores in model
     * @see Model
     */
    public void outputData() {
        view.printMessage(View.SURNAME_MESSAGE + model.getSurname());
        view.printMessage(View.NICK_MESSAGE + model.getNickname());
    }
}
