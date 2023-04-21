public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));

        list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
    }
}