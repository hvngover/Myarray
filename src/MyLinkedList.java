public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private int size;

    public void add(E e) {
        add(size, e);
    }