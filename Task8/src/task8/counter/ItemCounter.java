package task8.counter;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ItemCounter {

    public static Map<Integer, Integer> countItems(List<Integer> list) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer number : list) {
            if(number == null){
                throw new IllegalArgumentException("Null is denied");
            }
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        return map;
    }

    public static void printMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

}
