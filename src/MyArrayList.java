public class MyArrayList<E> implements MyList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public void add(E e) { // add element to end of array
        if (size == data.length) { // if array is full, resize it
            resize();
        }
        data[size++] = e; // add element to end of array
    }
}