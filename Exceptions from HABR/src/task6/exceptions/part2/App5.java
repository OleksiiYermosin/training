package task6.exceptions.part2;

public class App5 {

    public static void main(String[] args) {
        launchFirstExample();
        launchSecondExample();
    }

    public static void launchFirstExample() {
        try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }
    }

    public static void launchSecondExample() {
        try {
            throw new Exception();
        } catch (Throwable e) {
            // ...
        }
    }



}
