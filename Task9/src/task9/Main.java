package task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = {6, 2, -20, 4, 5, 4, 7, -1, 0};
        int multiplier = 10;
        double average = IntStream.of(array).average().orElse(Double.NaN);
        int minElement = IntStream.of(array).min().getAsInt();
        int indexOfMinElement = IntStream.of(array).boxed().collect(Collectors.toList()).indexOf(minElement);
        long amountOfZeroElements = IntStream.of(array).filter(x -> x == 0).count();
        long amountOfBiggerThanZeroElements = IntStream.of(array).filter(x -> x > 0).count();
        array = IntStream.of(array).map(x -> x * multiplier).toArray();

        System.out.println("Average amount of array = " + average);
        System.out.println("Min element of array = " + minElement + ", index of min element = " + indexOfMinElement);
        System.out.println("Amount of zero elements in array = " + amountOfZeroElements);
        System.out.println("Amount of bigger than zero elements = " + amountOfBiggerThanZeroElements);
        System.out.println("Array multiplied on " + multiplier + ": " + Arrays.toString(array));
    }

}
