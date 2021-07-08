package task6.form.controller;

import task6.form.model.Model;
import task6.form.model.entity.NotUniqueLoginException;
import task6.form.model.entity.User;
import task6.form.view.View;

import java.util.Scanner;

import static task6.form.view.TextConstants.*;

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
        User user = registerCorrectly(regController);
        outputUser(user);
        scanner.close();
    }

    /**
     * Method that collects information and creates user`s entity
     * @param registrationController - registration controller
     * @return entity of class User
     */
    private User registerCorrectly(RegistrationController registrationController){
        String surname = registrationController.getSurname();
        String login;
        while(true){
            try{
                login = registrationController.getNickname();
                break;
            }catch (NotUniqueLoginException exception){
                view.printMessage(view.getRealString(LOGIN_NICKNAME_EXCEPTION)
                        + exception.getNotUniqueLogin() + " "
                        + view.getRealString(LOGIN_EXIST_EXCEPTION));
            }
        }
        return new User(surname, login);
    }

    /**
     * Method that prints information about registered user
     */
    public void outputUser(User user){
        view.printMessage(view.getRealString(SURNAME_MESSAGE)+user.getSurname());
        view.printMessage(view.getRealString(NICK_MESSAGE)+user.getNickname());
    }

}
