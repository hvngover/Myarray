import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> implements MyStack<E> {
    private LinkedList<E> stack;

    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }

}