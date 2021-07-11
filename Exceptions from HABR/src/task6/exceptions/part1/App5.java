package task6.exceptions.part1;

public class App5 {
    public static void main(String[] args) {
        launchFirstExample();
        launchSecondExample();
        System.err.println();
        launchThirdExample();
    }

    public static void launchFirstExample() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }

    public static void launchSecondExample() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
    }

    public static void launchThirdExample() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {throw new Error();}
                System.err.print(" 2.3");
            } catch (Throwable t) {
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}
