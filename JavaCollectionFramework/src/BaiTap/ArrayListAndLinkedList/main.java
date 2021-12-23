package BaiTap.ArrayListAndLinkedList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ProductManager productProductManager = new ProductManager(new ArrayList<>());
        System.out.println("Them san pham");
        productProductManager.add(new Product("Mi", 2000));
        productProductManager.add(new Product("Milk", 4000));
        productProductManager.add(new Product("Fanta", 5000));
        productProductManager.add(new Product("Candy", 1000));
        productProductManager.add(new Product("Kem", 1500));
        productProductManager.display();

        System.out.println("sửa thông tin sản phẩm theo id = 1");
        productProductManager.updateProduct(1);
        System.out.println("Xóa sản phẩm theo id = 2");
        productProductManager.remove(2);
        System.out.println("Hiển thị sản phẩm sau khi xóa");
        productProductManager.display();
        System.out.println("Tìm kiếm sản phẩm theo tên");
        String nameFind = "Fanta";
        System.out.println(productProductManager.searchByName(nameFind));
        System.out.println("Sắp xếp sản phẩm theo giá tăng dần");
        productProductManager.sortIncrease();
        productProductManager.display();
        System.out.println("Sắp xếp sản phẩm theo día giảm dần");
        productProductManager.sortDecrease();
        productProductManager.display();
    }
}
