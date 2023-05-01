import java.util.NoSuchElementException;

public class MyArrayListQueue<E> implements MyQueue<E> {
    private MyArrayList<E> queue;

    // Constructor initializes the queue with an empty MyArrayList
    public MyArrayListQueue() {
        queue = new MyArrayList<>();
    }

    // Adds an element to the rear of the queue
    public void enqueue(E e) {
        queue.add(e);
    }

    public E dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }



}
