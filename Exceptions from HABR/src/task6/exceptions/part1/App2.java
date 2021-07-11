package task6.exceptions.part1;

public class App2 {
    public static void main(String[] args) {
        sqr(4);
        secondSqr(4);
        thirdSqr(4);
        //fourthSqr(4);
        //fifthSqr(4);
        //sixthSqr(4);
        //seventhSqr(4);

    }

    public static double sqr(double arg) {
        return arg * arg;
    }

    public static double secondSqr(double arg) {
        int k = 1;
        return k;
    }

    public static double thirdSqr(double arg) {
        int k = 1;
        return (double) k;
    }

    public static double fourthSqr(double arg) {
        while (true) ;
    }

    public static double fifthSqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        } else {
            while (true) ;
        }
    }

    public static double sixthSqr(double arg) {
        throw new RuntimeException();
    }


    public static double seventhSqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;
        } else if (time % 2 == 1) {
            while (true) ;
        } else {
            throw new RuntimeException();
        }
    }

}
