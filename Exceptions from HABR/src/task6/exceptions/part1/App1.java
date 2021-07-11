package task6.exceptions.part1;

public class App1 {
    public static void main(String[] args) throws Throwable {
        launchFirstTryCatchMethod();
        launchFirstThrowMethod();
        launchSecondThrowMethod();
    }

    public static void launchFirstTryCatchMethod() {
        try {
        } catch (Throwable t) {}
    }

    public static void launchFirstThrowMethod() {
        try {
            throw new Error();
        }catch(Error error){}
    }

    public static void launchSecondThrowMethod() {
        try {
            Error ref = new Error(); // создаем экземпляр
            throw ref;               // "бросаем" его
        }catch(Error error){
        }
    }
}
