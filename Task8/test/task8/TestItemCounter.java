package task8;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import task8.counter.ItemCounter;

import java.util.*;

public class TestItemCounter {

    public static Map<Integer, Integer> firstMap;

    @BeforeClass
    public static void initializeTest(){
        firstMap = new TreeMap<>();
        firstMap.put(1, 1);
        firstMap.put(2, 2);
        firstMap.put(3, 3);
    }

    @Test
    public void testCounter(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        Map<Integer, Integer> map = ItemCounter.countItems(list);
        Assert.assertEquals(firstMap, map);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullCounter(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, null, null));
        Map<Integer, Integer> map = ItemCounter.countItems(list);
    }

}
