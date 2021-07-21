package task8.counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        Map<Integer, Integer> counts = ItemCounter.countItems(list);
        ItemCounter.printMap(counts);
    }

}
