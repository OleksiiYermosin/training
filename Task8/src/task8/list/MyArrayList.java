package task8.list;

import java.util.*;

public class MyArrayList<T> implements MyList<T>, Collection<T>{

    private Object[] values;

    private int capacity;

    private int size;

    public MyArrayList() {
        this.values = new Object[]{};
        this.capacity = 0;
        this.size = 0;
    }

    public MyArrayList(int initialCapacity) {
        this.values = new Object[initialCapacity];
        this.capacity = initialCapacity;
        this.size = 0;
    }

    public MyArrayList(Collection<? extends T> c) {
        this();
        Object[] a = c.toArray();
        if (a.length != 0) {
            this.size = a.length;
            this.capacity = a.length;
            values = Arrays.copyOf(a, size, Object[].class);
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return (indexOf(o) != -1);
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            if (hasNext()) {
                return (T) values[index++];
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        public int getIndex() {
            return index - 1;
        }
    }


    @Override
    public Object[] toArray() {
        return Arrays.copyOf(values, size);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length < size) {
            return (E[]) Arrays.copyOf(values, size, a.getClass());
        }
        System.arraycopy(values, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        int localSize = size;
        if (size == capacity) {
            expand();
        }
        values[size] = t;
        size++;
        return size != localSize;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Remove operation is not allowed");
    }

    private void expand() {
        values = Arrays.copyOf(values, ((capacity + 1) * 3) / 2);
        capacity = ((capacity + 1) * 3) / 2;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        int localSize = size;
        for (T o : c) {
            add(o);
        }
        return size != localSize;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Remove operation is not allowed");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Retain operation is not allowed");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Clear operation is not allowed");
    }

    private void checkBounds(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        int localSize = size;
        checkBounds(index);
        T[] array = (T[]) Arrays.copyOfRange(values, index, size);
        List<T> secondPart = new LinkedList<>(Arrays.asList(array));
        size = index;
        addAll(c);
        addAll(secondPart);
        return localSize != size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        checkBounds(index);
        return (T) values[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(int index, T element) {
        checkBounds(index);
        T[] array = (T[]) Arrays.copyOfRange(values, index, size);
        List<T> secondPart = new LinkedList<>(Arrays.asList(array));
        size = index;
        add(element);
        addAll(secondPart);
    }

    @Override
    public int indexOf(Object o) {
        Iterator<T> iterator = iterator();
        if (o == null) {
            while (iterator.hasNext()) {
                if (o == iterator.next()) {
                    return ((Itr) iterator).getIndex();
                }
            }
        } else {
            while (iterator.hasNext()) {
                if (o.equals(iterator.next())) {
                    return ((Itr) iterator).getIndex();
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Iterator<T> iterator = iterator();
        int index = -1;
        if (o == null) {
            while (iterator.hasNext()) {
                if (o == iterator.next()) {
                    index = ((Itr) iterator).getIndex();
                }
            }
        } else {
            while (iterator.hasNext()) {
                if (o.equals(iterator.next())) {
                    index = ((Itr) iterator).getIndex();
                }
            }
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\"MyArrayList{values=\"");
        for (int i = 0; i < size - 1; i++) {
            sb.append(get(i)).append(", ");
        }
        sb.append(get(size - 1)).append("\"}\"");
        return sb.toString();
    }
}
