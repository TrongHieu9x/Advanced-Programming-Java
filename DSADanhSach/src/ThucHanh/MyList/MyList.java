package ThucHanh.MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Cài đặt phương thức ensureCapa()
    //Tăng gấp đôi kích thước mảng chứa các phần tử
    private void  ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
// Cài đặt phương thức add()
    //Thêm một phần tử vào cuối danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    // Cài đặt phương thức get()
    // Phương thức get() trả về vừa ở vị trí thứ i trong danh sách
    public E get (int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
