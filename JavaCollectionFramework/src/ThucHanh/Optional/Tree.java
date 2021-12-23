package ThucHanh.Optional;

public interface Tree<E> {
    /**
     *Chèn phần tử e vào cây tìm kiếm nhị phân.
     * Trả về đúng nếu phần tử được chèn thành công.
     */
    boolean insert(E e);
    /**
     * Inorder đi qua từ gốc
     */
    void inorder();
    /**
     * Lấy số lượng nút trong cây
     */
    int getSize();
}
