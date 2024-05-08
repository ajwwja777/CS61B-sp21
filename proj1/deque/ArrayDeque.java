/**
 * See AList first.
 */
package deque;

public class ArrayDeque<T> implements deque.Deque<T>{

    private T[] items;
    private int headerIndex = 0;
    private int lastIndex = 0;
    private int size = 0;
    private int length = 8;

    /* Creates an empty array deque. */
    /* The starting size of your array should be 8. */
    public ArrayDeque() {
        items = (T[]) new Object[length];
        size = 0;
    }

    /* autoGrade: The following constructors should be removed */
    /*
    public ArrayDeque(T item) {
        items = (T[]) new Object[length];
        size = 0;
        addFirst(item);
    }
    */

    /*             h */
    /* 0 1 2 3 4 5 6 7 */
    private void resize(int capacity) {
        T[] newItem = (T[]) new Object[capacity];
        System.arraycopy(items, headerIndex, newItem, 0, size - headerIndex);
        System.arraycopy(items, 0, newItem, size - headerIndex, headerIndex);
        items = newItem;
        headerIndex = 0;
        length = capacity;
        lastIndex = length - 1;
    }
    
    /* must take constant time, except during resizing operations. */
    @Override
    public void addFirst(T item) {
        if (size == length || lastIndex + 1 == headerIndex) {
            resize(size * 2);
        }
        if (size == 0) {
            items[headerIndex] = item;
        } else {
            headerIndex--;
            if (headerIndex < 0) {
                headerIndex = length + headerIndex;
            }
            items[headerIndex] = item;
        }
        size++;
    }
    
    /* must take constant time, except during resizing operations. */
    @Override
    public void addLast(T item) {
        if (size == length || lastIndex + 1 == headerIndex) {
            resize(size * 2);
        }
        if (size == 0) {
            items[lastIndex] = item;
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /* must take constant time. */
    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        int counter = 0;
        int i = headerIndex;
        int j = 0;
        while (i < length && counter < size) {
            System.out.println(items[i]);
            counter++;
            i++;
        }
        while (j < headerIndex && counter < size) {
            System.out.println(items[j]);
            counter++;
            j++;
        }
    }

    /* must take constant time, except during resizing operations. */
    @Override
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        T firstItem = items[headerIndex];
        headerIndex++;
        size--;
        return firstItem;
    }

    /* must take constant time, except during resizing operations. */
    @Override
    public T removeLast() {
        if (size == 0) {
            return null;
        }
        T lastItem = items[lastIndex];
        lastIndex--;
        if (lastIndex < 0) {
            lastIndex = length + headerIndex;
        }
        size--;
        return lastItem;
    }

    /* must take constant time. */
    @Override
    public T get(int index) {
        return items[index];
    }
}
