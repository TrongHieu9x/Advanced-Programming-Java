package Bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, index, size;
        int[] arr;

        System.out.println("Nhap vao do dai mang");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("nhap vao vi tri can them");
        index = scanner.nextInt();
        System.out.println("nhap vao so can them vi tri index");
        number = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("nhap vao phan tu " + i + " cua mang arr: ");
            arr[i] = scanner.nextInt();
        }

        int[] array = new int[arr.length + 1];
        addElement(arr, array, number, index);

    }
    public static void addElement (int[] arr,int[] array, int number, int index){
        for (int i = 0; i < index; i++) {
            array[i] = arr[i];
        }
        for (int i = arr.length; i > index; i--) {
            array[i] = arr[i - 1];
        }
        array[index] = number;
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
