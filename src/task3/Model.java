package task3;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int secretNumber;
    private int lowerBound;
    private int upperBound;
    private int counter;
    private final List<Integer> log = new ArrayList<>();

    public void initializeSecretNumber() {
        secretNumber = (int) Math.ceil(Math.random() *
                (upperBound - lowerBound - 1) + lowerBound);
    }

    public void setPrimaryBounds(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int isGuessed(int value) {
        if (value == secretNumber) {
            return 0;
        }
        if (value > secretNumber) {
            upperBound = value;
            return 1;
        }
        lowerBound = value;
        return 2;
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

    public List<Integer> getLog() {
        return log;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
