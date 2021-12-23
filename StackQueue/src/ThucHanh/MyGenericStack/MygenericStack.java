package ThucHanh.MyGenericStack;


import java.util.EmptyStackException;
import java.util.LinkedList;

// Tạo lớp MyGenericStack với các thuộc tính
public class MygenericStack <T> {
    private LinkedList<T> stack;

    public MygenericStack() {
        stack = new LinkedList();
    }

//Cài đặt phương thức push()
    public void push(T element) {
        stack.addFirst(element);
    }

//Cài dặt Phương thức isEmpty()
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

//Cài đặt phuong thức pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

//Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }
}
