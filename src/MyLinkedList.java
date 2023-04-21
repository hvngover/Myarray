public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head; // reference to the first node in the list
    private int size; // number of elements in the list

    // adds the specified element to the end of the list
    public void add(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }


}