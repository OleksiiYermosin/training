package task6.exceptions.part2;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class App2 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
