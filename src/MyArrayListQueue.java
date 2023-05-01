import java.util.NoSuchElementException;

public class MyArrayListQueue<E> implements MyQueue<E> {
    private MyArrayList<E> queue;

    // Constructor initializes the queue with an empty MyArrayList
    public MyArrayListQueue() {
        queue = new MyArrayList<>();
    }

    public void enqueue(E e) {
        queue.add(e);
    }



}
