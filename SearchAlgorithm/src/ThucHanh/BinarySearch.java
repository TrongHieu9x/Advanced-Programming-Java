package ThucHanh;


import java.util.Scanner;

//Tạo class BinarySearch khai báo 1 mảng số nguyên được sắp xếp theo thứ tự tănng dần
public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

//Cài đặt phương thức binarySearch(int[] list, int key)
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; 
    }
//Cài đặt phương thức main để thực thi
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }

}
