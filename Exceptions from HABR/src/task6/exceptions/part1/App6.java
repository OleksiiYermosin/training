package task6.exceptions.part1;

public class App6 {
    public static void main(String[] args) {
        launchFirstExample();
        launchSecondExample();
        launchThirdExample();
    }

    public static void launchFirstExample() {
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }

    public static void launchSecondExample() {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }

    public static void launchThirdExample() {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}
