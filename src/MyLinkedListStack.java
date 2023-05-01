import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> implements MyStack<E> {
    private LinkedList<E> stack;

    // Constructor initializes an empty linked list
    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }

}