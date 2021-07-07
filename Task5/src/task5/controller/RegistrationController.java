package task5.controller;

import task5.model.Model;
import task5.view.View;

import java.util.Scanner;

import static task5.controller.RegularExpressions.*;
import static task5.view.TextConstants.NICK_PROMPT;
import static task5.view.TextConstants.SURNAME_PROMPT;

/**
 * Class that is used for user`s registration
 */
public class RegistrationController {

    private final Model model;
    private final View view;
    private final Scanner scanner;

    /**
     * Constructor of class RegistrationController
     * @param model - object of class Model
     * @param view - object of class View
     * @param scanner - object of class Scanner
     */
    public RegistrationController(Model model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    /**
     * Method that updates model and registers user
     */
    public void register(){
        UtilityController utilityController = new UtilityController(scanner, view);
        String surnameRegEx = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_EN;
        view.printMessage(view.getRealString(SURNAME_PROMPT));
        model.setSurname(utilityController.readCorrectData(SURNAME_PROMPT, surnameRegEx));
        view.printMessage(view.getRealString(NICK_PROMPT));
        model.setNickname(utilityController.readCorrectData(NICK_PROMPT, REGEX_NICK));
    }
}
