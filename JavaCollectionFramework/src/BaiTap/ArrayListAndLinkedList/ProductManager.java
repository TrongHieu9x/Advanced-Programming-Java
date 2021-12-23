package BaiTap.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> lists;
    Scanner scan = new Scanner(System.in);
    private Scanner scanner;

    public ProductManager(ArrayList<Product> list) {
        lists = list;
    }

    public void display() {
        System.out.println("Danh sach san pham: ");
        Iterator<Product> iterator = lists.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
        System.out.println();
    }

    public void add(Product product) {
        lists.add(product);
    }

    public void remove(int id){
        lists.removeIf(product -> product.getId() == id);
    }

    public Product searchByName(String name) {
        for (Product product : lists) {
            if (product.getName().equals(name)) {
                return product;
            }   
        }
        return null;
    }

    public void updateProduct(int id) {
        for (Product product : lists) {
            if (product.getId() == id) {
                System.out.println("Enter new name: ");
                product.setName(scanner.nextLine());
                System.out.println("Enter new price: ");
                product.setPrice(scanner.nextDouble());
            }
        }
    }
    
    public void sortIncrease() {
        lists.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
    }
    
    public void sortDecrease() {
        lists.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
    }
}
