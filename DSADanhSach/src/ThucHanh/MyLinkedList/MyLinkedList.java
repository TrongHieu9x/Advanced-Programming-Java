package ThucHanh.MyLinkedList;


import org.w3c.dom.Node;

public class MyLinkedList {
// Lớp MyLinkedList chứa lớp Node
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

// tạo Class Node
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

// thêm đối tượng vào vị trí thứ index trong danh sách
// vị trí thêm (index), đối tượng thêm (data)
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

// Thêm đối tượng vào vị trí đầu tiên trong danh sách
// Tham số đầu vào : đối tượng thêm data
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

//Lấy phần tử ở vị trí index từ danh sách
// tham số đầu vào : Vị trí cần lấy (index)
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

//Hiển thị danh sách các phần tử trong danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
