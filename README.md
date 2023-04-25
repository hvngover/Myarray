# MyList Implementation in Java

This repository contains two implementations of a simple list interface called MyList in Java. The two implementations are:

1. **MyArrayList** : A list implementation based on an array that can dynamically resize itself as needed.
2. **MyLinkedList** : A list implementation based on a singly linked list.

Both implementations conform to the MyList interface, which defines the basic operations that any list implementation should support, such as adding, removing, and retrieving elements.


# MyArrayList

**MyArrayList** is a dynamic array that allows for efficient insertion and removal at the end of the list. The implementation automatically resizes the array if it reaches its capacity. Elements can also be inserted at any position in the array, but this operation requires shifting the subsequent elements to make space.

## Description

An ArrayList is a resizable-array implementation of List interface in Java. It implements all optional List operations and permits all elements, including null. In addition to implementing List interface, this class provides methods to manipulate array size (like ensureCapacity() and trimToSize()).

## Explanation

This implementation uses an array to store the elements of the list. When the array is full, it is resized by creating a new array with twice the capacity and copying the elements from the old array to the new one.

The class provides methods for adding elements to the list, removing elements from the list, and getting elements from the list by index.

### Method Details

#### add(E e)
Adds an element to this ArrayList.

```java
public void add(E e) {
        // If the array is already full, resize it
        if (size == data.length) {
            resize();
        }
        // Add the new element and increment the size
        data[size++] = e;
    }
```
#### add(int index, E e)
```java
public void add(int index, E e) {
        // Check if the index is within bounds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // If the array is already full, resize it
        if (size == data.length) {
            resize();
        }
        // Shift all elements to the right of the specified index one position to the right
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        // Insert the new element at the specified index and increment the size
        data[index] = e;
        size++;
    }
```

Inserts an element at a specified position in this ArrayList.

#### get(int index)

Returns an element at a specified position in this ArrayList.
```java
public E get(int index) {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Return the element at the specified index
        return data[index];
    }
```

#### remove(int index)

Removes an element at a specified position in this ArrayList.

```java
    public E remove(int index) {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Save the element to be removed
        E element = data[index];
        // Shift all elements to the right of the specified index one position to the left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        // Set the last element in the array to null and decrement the size
        data[--size] = null;
        // Return the element that was removed
        return element;
    }
    
```
#### size()

Returns number of elements in this ArrayList.
```java
public int size() {
        return size;
    }
```

## Usage

Here’s how you can use this implementation:
```java
MyArrayList<Integer> list = new MyArrayList<>();

list.add(1);
list.add(2);
list.add(3);

System.out.println(list.get(0)); // Output: 1
System.out.println(list.get(1)); // Output: 2
System.out.println(list.get(2)); // Output: 3

list.remove(1);

System.out.println(list.get(0)); // Output: 1
System.out.println(list.get(1)); // Output: 3
```


# MyLinkedList

**MyLinkedList** is a linked list that allows for efficient insertion and removal at any position in the list. Elements can be inserted at any position in constant time, but accessing an element requires traversing the list from the beginning.

## Description

A linked list is a linear data structure where each element is a separate object. Each element (we will call it a node) of a list is comprising of two items - the data and a reference to the next node. The last node has a reference to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node.

## Explanation

This implementation uses a singly linked list to store the elements of the list. When an element is added to the list, a new node is created and added to the end of the list. When an element is removed from the list, the node containing that element is removed from the list.

The class provides methods for adding elements to the list, removing elements from the list, and getting elements from the list by index.

### Method Details

#### add(E e)

Adds an element to the end of this list.
```java
public void add(E element) {
        add(size, element);
    }
```
#### add(int index, E e)

Inserts an element at the specified position in this list.
```java
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
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        // Insert the new node after the current node
        current.next = new Node<>(element, current.next);
        size++;
    }
    
```
#### get(int index)

Returns the element at the specified position in this list.
```java
public E get(int index) {
        // Throw an exception if the index is invalid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Find the node at the specified index
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        // Return the data of the node at the specified index
        return current.data;
    }
    
```
#### remove(int index)

Removes the element at the specified position in this list.
```java
public E remove(int index) {
        // Throw an exception if the index is invalid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // If removing the first element
        if (index == 0) {
            // Get the data of the head node, and point the head to the next node
            E element = head.data;
            head = head.next;
            size--;
            return element;
        }

        // Find the node at the index immediately preceding the node to be removed
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        // Get the data of the node to be removed, and point the previous node to the next node
        E element = current.next.data;
        current.next = current.next.next;
        size--;
        return element;
    }
```
#### size()

Returns the number of elements in this list.
```java
public int size() {
        return size;
    }
```
## Usage

Here’s how you can use this implementation:
```java
MyLinkedList<Integer> list = new MyLinkedList<>();

list.add(1);
list.add(2);
list.add(3);

System.out.println(list.get(0)); // Output: 1
System.out.println(list.get(1)); // Output: 2
System.out.println(list.get(2)); // Output: 3

list.remove(1);

System.out.println(list.get(0)); // Output: 1
System.out.println(list.get(1)); // Output: 3
