# MyLinkedListStack

**MyLinkedListStack** is a Java class that implements the MyStack interface. It uses a LinkedList to implement a stack data structure that allows for adding and removing elements in a last-in-first-out (LIFO) manner. This means that the last element added to the stack is the first one to be removed. The class provides methods for pushing elements onto the stack, popping elements off the stack, and peeking at the top element without removing it. It also provides methods for checking if the stack is empty and getting the number of elements in the stack.


## Description

The **MyLinkedListStack** class has a private field of type LinkedList<E>, where E is the generic type of the stack elements. The class constructor initializes an empty linked list. The push() method adds an element to the top of the stack by calling the addFirst() method of the linked list. The pop() method removes and returns the top element from the stack by calling the removeFirst() method of the linked list. If the stack is empty, it throws an EmptyStackException. The peek() method returns the top element of the stack without removing it by calling the getFirst() method of the linked list. If the stack is empty, it throws an EmptyStackException. The isEmpty() method returns true if the stack is empty and false otherwise by calling the isEmpty() method of the linked list. The size() method returns the number of elements in the stack by calling the size() method of the linked list.

## Explanation

**MyLinkedListStack** is a Java class that implements the MyStack interface. It uses a linked list to implement a stack data structure, which allows elements to be added and removed from the top of the stack in constant time. The class provides methods for pushing an element onto the stack, popping the top element off the stack, peeking at the top element without removing it, checking if the stack is empty, and getting the size of the stack.

### Method Details
  
#### push(E e)
This method adds an element of type E to the top of the stack.
It adds the element to the first position in the LinkedList, which is equivalent to the top of the stack.
```java
  // Adds an element to the top of the stack
  public void push(E e) {
        stack.addFirst(e);
    }
  
```
  
### pop()
This method removes and returns the element at the top of the stack.
It throws an EmptyStackException if the stack is empty.

```java
// Throws an exception if the stack is empty
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }  // Removes and returns the element at the top of the stack
        return stack.removeFirst();
    }
```

### peek()
This method returns the element at the top of the stack without removing it.
It throws an EmptyStackException if the stack is empty.

```java
// Throws an exception if the stack is empty
    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst(); // Returns the element at the top of the stack without removing it
    }
```
  
### isEmpty()
This method returns a boolean indicating whether the stack is empty.

```java
// Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return stack.isEmpty();
    }
```

### size()
This method returns the number of elements currently in the stack.

```java
// Returns the number of elements in the stack
    public int size() {
        return stack.size();
    }
}
```
## Usage

```java
MyLinkedListStack<Integer> stack = new MyLinkedListStack<>();
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println(stack.peek()); // Output: 3
System.out.println(stack.pop()); // Output: 3
System.out.println(stack.pop()); // Output: 2
System.out.println(stack.isEmpty()); // Output: false
System.out.println(stack.size()); // Output: 1

```


 
# MyArrayListQueue
**MyArrayListQueue** is a Java class that implements a queue data structure using an ArrayList as the underlying data structure. It implements the MyQueue interface, which defines the standard methods for a queue, including enqueue (adding an element to the back of the queue), dequeue (removing and returning the front element of the queue), peek (returning the front element of the queue without removing it), isEmpty (checking whether the queue is empty), and size (returning the number of elements in the queue)

## Description
**MyArrayListQueue** is a generic class that implements the MyQueue interface. It uses an instance of MyArrayList to store the elements of the queue. The constructor initializes the queue with an empty MyArrayList.
The class provides methods for adding an element to the rear of the queue, removing and returning the element at the front of the queue, returning the element at the front of the queue without removing it, checking if the queue is empty, and getting the number of elements in the queue.


## Explanation

**MyArrayListQueue** is a Java class that implements the MyQueue interface. It uses an array list to implement a queue data structure, which allows elements to be added to the rear of the queue and removed from the front of the queue in constant time. The class provides methods for enqueueing an element to the rear of the queue, dequeuing the front element from the queue, peeking at the front element without removing it, checking if the queue is empty, and getting the size of the queue.

### Method Details

#### enqueue(E e)
  This method adds an element to the rear of the queue by calling the add() method of MyArrayList class.
```java
// Adds an element to the rear of the queue
    public void enqueue(E e) {
        queue.add(e);
    }
```
#### dequeue()
  This method removes and returns the element at the front of the queue by calling the remove() method of MyArrayList class with an index of 0. It throws a NoSuchElementException if the queue is empty.
  ```java
// Throws NoSuchElementException if the queue is empty
    public E dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }  // Removes and returns the element at the front of the queue
        return queue.remove(0);
    }
```
#### peek()
  This method returns the element at the front of the queue without removing it by calling the get() method of MyArrayList class with an index of 0. It throws a NoSuchElementException if the queue is empty.
  ```java
// Throws NoSuchElementException if the queue is empty
    public E peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }  // Returns the element at the front of the queue without removing it
        return queue.get(0);
    }
```
#### isEmpty()
  This method returns true if the queue is empty, false otherwise by calling the isEmpty() method of MyArrayList class.
  ```java
// Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return queue.isEmpty();
    }// Throws NoSuchElementException if the queue is empty
    public E peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }  // Returns the element at the front of the queue without removing it
        return queue.get(0);
    }
```
#### size()
  This method returns the number of elements in the queue by calling the size() method of MyArrayList class.// Adds an element to the rear of the queue
    public void enqueue(E e) {
        queue.add(e);
    }
  ```java
// Returns the number of elements in the queue
    public int size() {
        return queue.size();
    }
```

## Usage

```java
MyArrayListQueue<String> queue = new MyArrayListQueue<>();

// Add elements to the queue
queue.enqueue("apple");
queue.enqueue("banana");
queue.enqueue("cherry");

// Dequeue elements from the queue
System.out.println(queue.dequeue());  // Output: "apple"
System.out.println(queue.dequeue());  // Output: "banana"

// Peek at the front element of the queue
System.out.println(queue.peek());     // Output: "cherry"

// Check if the queue is empty
System.out.println(queue.isEmpty());  // Output: "false"

// Get the number of elements in the queue
System.out.println(queue.size());     // Output: "1"

```
