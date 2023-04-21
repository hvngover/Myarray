public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head; // reference to the first node in the list
    private int size; // number of elements in the list

    // adds the specified element to the end of the list
    public void add(E e) {
        add(size, e);
    }

    // inserts the specified element at the specified position in the list
    public void add(int index, E element) {
        // Check if index is out of bounds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        // If adding at beginning of list
        if (index == 0) {
            head = new Node<>(element, head);
            size++;
            return;
        }
        // Insert the new node after the current node
        current.next = new Node<>(e, current.next);
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


}