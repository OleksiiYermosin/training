package task6.form.controller;

import task6.form.model.Model;
import task6.form.model.entity.DBUser;
import task6.form.model.entity.NotUniqueLoginException;
import task6.form.view.View;

import java.util.Scanner;

import static task6.form.controller.RegularExpressions.*;
import static task6.form.view.TextConstants.NICK_PROMPT;
import static task6.form.view.TextConstants.SURNAME_PROMPT;

/**
 * Class that is used for user`s registration
 */
public class RegistrationController {

    private final Model model;
    private final View view;
    private final Scanner scanner;
    private final UtilityController utilityController;

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
        this.utilityController = new UtilityController(scanner, view);
    }

    /**
     * Nethod that checks is surname correct
     * @return surname
     */
    public String getSurname(){
        String surnameRegEx = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_EN;
        view.printMessage(view.getRealString(SURNAME_PROMPT));
        return utilityController.readCorrectData(SURNAME_PROMPT, surnameRegEx);
    }

    /**
     * Method that checks is login correct and is it exist
     * @return nickname
     * @throws NotUniqueLoginException - not unique login exception
     */
    public String getNickname() throws NotUniqueLoginException {
        view.printMessage(view.getRealString(NICK_PROMPT));
        String result = utilityController.readCorrectData(NICK_PROMPT, REGEX_NICK);
        if(DBUser.isExist(result)){
            throw new NotUniqueLoginException("You have entered not unique login", result);
        }
        return result;
    }
}
