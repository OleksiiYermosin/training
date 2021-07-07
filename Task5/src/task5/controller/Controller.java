package task5.controller;

import task5.model.Model;
import task5.view.View;

import java.util.Scanner;

import static task5.view.TextConstants.NICK_MESSAGE;
import static task5.view.TextConstants.SURNAME_MESSAGE;

/**
 * Class that updates <b>view</b> and manipulates <b>model</b>.
 * @author Oleksii Yermosin
 * @version 2.0
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
     * Method that registers user
     */
    public void registerUser(){
        Scanner scanner = new Scanner(System.in);
        RegistrationController regController = new RegistrationController(model, view, scanner);
        regController.register();
        scanner.close();
    }

    /**
     * Method that prints information about registered user
     */
    public void outputUser(){
        view.printMessage(view.getRealString(SURNAME_MESSAGE)+model.getSurname());
        view.printMessage(view.getRealString(NICK_MESSAGE)+model.getNickname());
    }

}
