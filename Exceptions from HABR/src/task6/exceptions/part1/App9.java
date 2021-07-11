package task6.exceptions.part1;

public class App9 {

    public static void main(String[] args) {
        launchFirstExample();
        System.err.println();
        launchSecondExample();
        System.err.println();
        launchThirdExample();
        System.err.println();
        launchFourthExample();
    }

    public static void launchFirstExample() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }

    public static void launchSecondExample() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new RuntimeException();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }

    public static void launchThirdExample() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }

    public static void launchFourthExample() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Error();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }

}
