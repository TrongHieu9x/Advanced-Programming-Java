package ThucHanh.Optional.StackArray;
//Tạo class MyStack và các thuộc tính
public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
//Cài đặt phương thức push()
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

//Cài đặt phương thức pop()
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is full");
        }
        return arr[--index];
    }

//Cài đặt phương thức size()
    public int size() {
        return index;
    }

//cài đặt phượng thức isEmpty()
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

//Cài đặt phương thức isFull()
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
