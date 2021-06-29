package task2.game;

import java.util.ArrayList;

public class Model {

    private int secretNumber;
    private int lowerBound;
    private int upperBound;
    private int counter;
    private ArrayList<Integer> log;

    public void initialize() {
        secretNumber = (int) (Math.random() * 100);
        setLowerBound(0);
        setUpperBound(100);
        log = new ArrayList<>();
    }

    public boolean checkNumber(int value) {
        return value == secretNumber;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public ArrayList<Integer> getLog() {
        return log;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
