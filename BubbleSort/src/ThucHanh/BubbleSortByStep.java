package ThucHanh;

import java.util.Scanner;

public class BubbleSortByStep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    //Cài đặt phương thức BubbleSortByStep (int[] list)
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
//Danh sách hoán đổi[i] với danh sách [i + 1]
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
//Đường chuyền tiếp theo vẫn cần thiết
                    needNextPass = true;
                }
            }
//Mảng có thể được sắp xếp và thẻ tiếp theo không cần thiết
            if (!needNextPass) {
                System.out.println("Mảng có thể được sắp xếp và thẻ tiếp theo không cần thiết");
                break;
            }
//Hiện danh sách sau khi sắp xếp
            System.out.println("List after the  " + k + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();

        }
    }
}