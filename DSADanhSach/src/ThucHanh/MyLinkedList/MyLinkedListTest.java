package ThucHanh.MyLinkedList;

import ThucHanh.MyLinkedList.MyLinkedList;

class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(11);
        ll.addFirst(11);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}