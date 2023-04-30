public class Main { // This is the main class that tests the MyArrayList and MyLinkedList implementations of MyList interface
    public static void main(String[] args) {
        // Testing MyArrayList
        MyList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        System.out.println("Before removing duplicates: " + list1);
        list1.delete_duplicates();
        System.out.println("After removing duplicates: " + list1);

        MyList<String> list2 = new MyLinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("b");
        list2.add("d");
        System.out.println("Before removing duplicates: " + list2);
        list2.delete_duplicates();
        System.out.println("After removing duplicates: " + list2);

    }
}