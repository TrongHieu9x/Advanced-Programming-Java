package BaiTap.MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

class MyLinkedListTest {
    public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();
//        MyLinkedList<Integer> linkerList = new MyLinkedList<>(1);
//        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
            linkedList.addFirst(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);
//        linkedList.printList();
            linkedList.add(3,100);
//        linkedList.printList();
            System.out.println(linkedList.get(3));
            System.out.println("-----------");

            Iterator<Integer> iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
    }
}