import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> implements MyStack<E> {
    private LinkedList<E> stack;

    // Constructor initializes an empty linked list
    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }
    // Adds an element to the top of the stack
    public void push(E e) {
        stack.addFirst(e);
    }


    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

}