package Bai_tap;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("nhap vao phan tu " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("so nho nhat cua mang: " + min);
    }
}
