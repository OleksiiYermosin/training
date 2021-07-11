package task6.exceptions.part1;

public class App8 {

    public static void main(String[] args) {
        launchFirstExample();
        System.err.println();
        launchSecondExample();
        System.err.println();
        launchThirdExample();
    }

    public static void launchFirstExample() {
        try {
            System.err.print(" 0");
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }

    public static void launchSecondExample() {
        try {
            System.err.print(" 0");
            if (true) {throw new Error();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }

    public static void launchThirdExample() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }

}
