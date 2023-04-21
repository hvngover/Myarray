public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head; // reference to the first node in the list
    private int size; // number of elements in the list

    // adds the specified element to the end of the list
    public void add(E e) {
        add(size, e);
    }

    // inserts the specified element at the specified position in the list
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) { // inserting at the beginning of the list
            head = new Node<>(e, head);
            size++;
            return;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

    }


}