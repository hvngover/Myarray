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

    // Throws NoSuchElementException if the queue is empty
    public E dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }  // Removes and returns the element at the front of the queue
        return queue.remove(0);
    }

    // Throws NoSuchElementException if the queue is empty
    public E peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }  // Returns the element at the front of the queue without removing it
        return queue.get(0);
    }




}
