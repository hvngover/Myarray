public class Main { // This is the main class that tests the MyArrayList and MyLinkedList implementations of MyList interface
    public static void main(String[] args) {
        // Testing MyLinkedListStack
        MyStack<Integer> stack1 = new MyLinkedListStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("Stack size: " + stack1.size());
        System.out.println("Top element: " + stack1.peek());
        System.out.println("Pop element: " + stack1.pop());
        System.out.println("Top element: " + stack1.peek());

        // Testing MyArrayListQueue
        MyQueue<String> queue1 = new MyArrayListQueue<>();
        queue1.enqueue("a");
        queue1.enqueue("b");
        queue1.enqueue("c");
        System.out.println("Queue size: " + queue1.size());
        System.out.println("Front element: " + queue1.peek());
        System.out.println("Dequeue element: " + queue1.dequeue());
        System.out.println("Front element: " + queue1.peek());
    }
}