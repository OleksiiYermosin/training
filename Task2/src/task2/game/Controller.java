package task2.game;

import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        model.initialize();
        view.printMessage(View.WELCOME_MESSAGE);
        while (true) {
            if (!model.getLog().isEmpty()) {
                view.printAttempts(model.getLog());
                view.printMessage(View.LAST_ATTEMPT_MESSAGE + model.getLog().get(model.getLog().size() - 1));
            }
            view.printRange(model.getLowerBound(), model.getUpperBound());
            int number = getInt(scanner);
            if (model.getLog().contains(number) || number > model.getUpperBound() || number < model.getLowerBound()) {
                view.printMessage(View.INCORRECT_DATA_MESSAGE);
                continue;
            }
            model.getLog().add(number);
            model.setCounter(model.getCounter() + 1);
            if (model.checkNumber(number)) {
                view.printMessage(View.GAME_OVER_MESSAGE + number);
                view.printMessage(View.TOTAL_ATTEMPTS_MESSAGE + model.getCounter());
                view.printAttempts(model.getLog());
                break;
            } else {
                updateBounds(number);
            }
        }
    }

    private int getInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            view.printMessage(View.INCORRECT_DATA_MESSAGE);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void updateBounds(int number) {
        if (number > model.getSecretNumber()) {
            model.setUpperBound(number);
            view.printMessage(View.BIGGER_MESSAGE);
        } else if (number < model.getSecretNumber()) {
            model.setLowerBound(number);
            view.printMessage(View.LOWER_MESSAGE);
        }
    }
}
