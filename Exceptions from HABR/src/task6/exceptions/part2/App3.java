package task6.exceptions.part2;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class App3 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {
        int a = 1;
    }
    public static void f1() throws FileNotFoundException {
        int b = 2;
    }
}
