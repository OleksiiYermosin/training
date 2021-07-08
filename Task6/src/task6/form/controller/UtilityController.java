package task6.form.controller;

import task6.form.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

import static task6.form.view.TextConstants.INCORRECT_DATA_MESSAGE;

/**
 * Class that is used for getting information from command line
 * @author Oleksii Yermosin
 * @version 1.0
 */
public class UtilityController {

    private final Scanner scanner;
    private final View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Method that checks input data
     * @param message - prompt message
     * @param regEx - regular expression
     * @return checked data
     */
    String readCorrectData(String message, String regEx) {
        String inputData;
        Pattern pattern = Pattern.compile(regEx);
        while(true){
            inputData = getLine(scanner, message);
            if(!pattern.matcher(inputData).matches()){
                view.printMessage(view.getRealString(INCORRECT_DATA_MESSAGE) + view.getRealString(message));
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
     */
    private String getLine(Scanner scanner, String message){
        while(!scanner.hasNextLine()){
            view.printMessage(view.getRealString(INCORRECT_DATA_MESSAGE) + view.getRealString(message));
            scanner.next();
        }
        return scanner.nextLine();
    }

}
