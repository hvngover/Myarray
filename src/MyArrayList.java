public class MyArrayList<E> implements MyList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    // Insert a new element at the specified index
    public void add(int index, E e) {
        // Check if the index is within bounds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // If the array is already full, resize it
        if (size == data.length) {
            resize();
        }
        // Shift all elements to the right of the specified index one position to the right
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        // Insert the new element at the specified index and increment the size
        data[index] = e;
        size++;
    }

    // Return the element at the specified index
    public E get(int index) {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Return the element at the specified index
        return data[index];
    }
    // Remove and return the element at the specified index
    public E remove(int index) {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Save the element to be removed
        E element = data[index];
        // Shift all elements to the right of the specified index one position to the left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        // Set the last element in the array to null and decrement the size
        data[--size] = null;
        // Return the element that was removed
        return element;
    }

    // Returns the number of elements in the list
    public int size() {
        return size;
    }

}