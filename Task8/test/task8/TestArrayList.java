package task8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task8.list.MyArrayList;
import task8.list.MyList;

public class TestArrayList {

    public static MyList<Integer> list;

    @Before
    public void initializeList(){
        list = new MyArrayList<>();
    }

    @Test
    public void testSize(){
        list.add(10);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testIsEmpty(){
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsContains(){
        list.add(1);
        Assert.assertTrue(list.contains(1));
    }

    @Test
    public void testToArray(){
        list.add(1);
        list.add(2);
        Assert.assertArrayEquals(new Object[]{1, 2}, list.toArray());
    }

    @Test
    public void testAdd(){
        Assert.assertTrue(list.add(4));
    }

}
