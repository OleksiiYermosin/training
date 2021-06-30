package task2.game;

import java.util.ArrayList;

public class View {

    public static final String WELCOME_MESSAGE = "Try to guess a generated number";
    public static final String GAME_OVER_MESSAGE = "Game over. Random number was ";
    public static final String TOTAL_ATTEMPTS_MESSAGE = "\tTotal amount of attempts: ";
    public static final String LOWER_MESSAGE = "\tYour value is less than secret number";
    public static final String BIGGER_MESSAGE = "\tYour value is bigger than secret number";
    public static final String LAST_ATTEMPT_MESSAGE = "Last number was ";
    public static final String INCORRECT_DATA_MESSAGE = "Incorrect data, please try again.";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printAttempts(ArrayList<Integer> attempts){
        System.out.print("\tYour attempts: ");
        for(int n : attempts){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void printRange(int lowerBound, int upperBound){
        System.out.println("Input number in range from " + lowerBound + " to " + upperBound + ".");
    }
}
