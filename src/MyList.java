public interface MyList<E> {
    // Adds an element to the end of the list
    void add(E e);

    // Adds an element at the specified index in the list
    void add(int index, E e);

    // Retrieves the element at the specified index in the list
    E get(int index);

    // Removes the element at the specified index in the list and returns it
    E remove(int index);

    // Returns the number of elements in the list
    int size();

    // Deletes duplicates from the list
    void delete_duplicates();

}
