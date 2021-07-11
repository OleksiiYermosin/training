package task6.exceptions.part1;

public class App7 {
    public static void main(String[] args) {
        launchFirstExample();
        launchSecondExample();
        launchFourthExample();
        launchFifthExample();
        launchSixthExample();
        launchThirdExample();
    }

    public static void launchFirstExample() {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }

    public static void launchSecondExample() {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }

    public static void launchThirdExample() {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }

    public static void launchFourthExample() {
        try {
            System.err.println("try");
            if (true) {return;}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }

    public static void launchFifthExample() {
        System.err.println(firstF());
    }

    public static int firstF() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }

    public static void launchSixthExample() {
        System.err.println(secondF());
    }

    public static int secondF() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }


}
