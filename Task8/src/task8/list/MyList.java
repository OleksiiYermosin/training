package task8.list;

import java.util.*;

public interface MyList<T> extends Iterable<T> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<T> iterator();

    Object[] toArray();

    boolean add(T t);

    boolean containsAll(Collection<?> c);

    boolean addAll(Collection<? extends T> c);

    boolean addAll(int index, Collection<? extends T> c);

    T get(int index);

    void add(int index, T element);

    int indexOf(Object o);

    int lastIndexOf(Object o);

}
