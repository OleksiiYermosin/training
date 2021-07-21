package task8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.add(2, 78);
        System.out.println(list);
        list.add(75);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        System.out.println(list.indexOf(4));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list.indexOf(90));
        System.out.println(list);
        System.out.println(list.contains(7));
        System.out.println(list.contains(90));
        List<Integer> tempList = new ArrayList<>(Arrays.asList(0, 75, 4));
        System.out.println(list.containsAll(tempList));
        System.out.println(list.size());
        MyList<Integer> newList = new MyArrayList<>();
        System.out.println(newList.isEmpty());
        list.addAll(13, Arrays.asList(15, 32, 11));
        System.out.println(list);
        list.addAll(Arrays.asList(26, 28, 30));
        System.out.println(list);
        MyList<Integer> secondList = new MyArrayList<>(10);
        System.out.println(secondList.size());
        MyList<Integer> thirdList = new MyArrayList<>(Arrays.asList(0, 5, 2));
        System.out.println(thirdList.size());
    }

}
