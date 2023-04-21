public class Main { // This is the main class that tests the MyArrayList and MyLinkedList implementations of MyList interface
    public static void main(String[] args) {
        // Testing MyArrayList
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        // Testing MyLinkedList
        list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
    }
}