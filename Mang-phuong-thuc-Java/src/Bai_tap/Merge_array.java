package Bai_tap;

import java.util.Scanner;

public class Merge_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr1 = createArray(scanner);
        int []arr2 = createArray(scanner);
        int []arr3 = mergeArray(arr1, arr2);

        for (int element:arr3) {
            System.out.print(element + " ");
        }
    }

    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhap so phan tu cua mang");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i =0; i < array.length; i++) {
            System.out.println("Nhap so phan tu " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int []arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++){
            if (i < arr1.length){
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        return arr3;
    }

}
