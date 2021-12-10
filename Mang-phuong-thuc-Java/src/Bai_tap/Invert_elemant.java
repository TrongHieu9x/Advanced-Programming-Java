package Bai_tap;

import java.util.Scanner;

public class Invert_elemant {
    public static void main(String[] args) {

        int [] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap vao phan tu thu: " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("nhap vao phan tu muon xoa");

        int h = scanner.nextInt();
        int xoaphantu = scanner.nextInt();
        for (int i = 1; i < array.length; i++) {
            if(array[i] == xoaphantu) {
                for (int j = 1; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        for (int k: array) {
            System.out.println(k + " ");
        }
    }
}
