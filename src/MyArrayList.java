public class MyArrayList<E> implements MyList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public void add(E e) {
        if (size == data.length) {
            resize();
        }
        data[size++] = e;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == data.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }
}