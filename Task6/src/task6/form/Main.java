package task6.form;

import task6.form.controller.Controller;
import task6.form.model.Model;
import task6.form.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.registerUser();
    }

}
