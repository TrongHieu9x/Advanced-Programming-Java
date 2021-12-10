package Thuc_hanh;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("nhap vao phan tu " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("so lon nhat cua mang: " + max);
    }
}
