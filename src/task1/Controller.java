package task1;

import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startReading(){
        Scanner scanner = new Scanner(System.in);
        String message;
        view.printMessage(View.WELCOME_MESSAGE);
        do {
            view.printMessage(View.FIRST_STRING);
            model.setFirstString(getString(scanner));
            view.printMessage(View.SECOND_STRING);
            model.setSecondString(getString(scanner));
            message = model.calculateMessage();
            view.printMessage(message);
        } while (message.equals("Incorrect data, try again!"));
        scanner.close();
    }

    public String getString(Scanner scanner){
        String str = "";
        while(scanner.hasNextLine()){
            str = scanner.nextLine();
            if(str.isEmpty()){
                view.printMessage(View.EMPTY_STRING);
                continue;
            }
            if(str.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            break;
        }
        return str;
    }
}
