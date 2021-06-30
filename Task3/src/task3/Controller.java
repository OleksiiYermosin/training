package task3;

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
        model.setPrimaryBounds(Bounds.PRIMARY_LOWER_BOUND, Bounds.PRIMARY_UPPER_BOUND);
        model.initializeSecretNumber();
        view.printMessage(View.WELCOME_MESSAGE);
        int result = 0, number;
        do {
            number = getInt(scanner);
            if (!isValidValue(number)) {
                continue;
            }
            model.getLog().add(number);
            model.setCounter(model.getCounter() + 1);
            result = processResult(number);
        } while (result != 0);
        view.printMessage(View.GAME_OVER_MESSAGE + number);
        view.printAttempts(model.getLog());
        view.printMessage(View.TOTAL_ATTEMPTS_MESSAGE + model.getCounter());
        scanner.close();
    }

    private int processResult(int number) {
        int result = model.isGuessed(number);
        if (result == 0) {
            return result;
        }
        if (result == 1) {
            view.printMessage(View.BIGGER_MESSAGE);
        } else if (result == 2) {
            view.printMessage(View.LOWER_MESSAGE);
        }
        view.printAttempts(model.getLog());
        view.printMessage(View.LAST_ATTEMPT_MESSAGE + model.getLog().get(model.getLog().size() - 1));
        return result;
    }

    private boolean isValidValue(int number) {
        if (model.getLog().contains(number) || number > model.getUpperBound() || number < model.getLowerBound()) {
            view.printMessage(View.INCORRECT_DATA_MESSAGE);
            return false;
        }
        return true;
    }

    private int getInt(Scanner scanner) {
        view.printRange(model.getLowerBound(), model.getUpperBound());
        while (!scanner.hasNextInt()) {
            view.printMessage(View.INCORRECT_DATA_MESSAGE);
            scanner.next();
        }
        return scanner.nextInt();
    }


}
