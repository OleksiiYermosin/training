package task6.exceptions.part1;

public class App3 {

    public static void main(String[] args) {
        area(-1,1);
        secondArea(-1,1);
        try {
            fourthArea(-1, 1);
        }catch (Exception e){}
        thirdArea(-1, 1);
    }

    public static int area(int width, int height) {
        return width * height;
    }

    public static int secondArea(int width, int height) {
        if (width < 0 || height < 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public static int thirdArea(int width, int height) {
        if (width < 0 || height < 0) {
            System.exit(0);
        }
        return width * height;
    }

    public static int fourthArea(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }

}
