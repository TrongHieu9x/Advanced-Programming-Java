package Bai_tap;

import java.util.Scanner;

public class MaxValue2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height");
        int height = scanner.nextInt();
        System.out.println("Enter width");
        int width = scanner.nextInt();
        int[][] arr = new int[height][width];
        for (int i = 0; i < height; i++ ){
            for (int j = 0; j < width; j++){
                System.out.println("nhap vao phan tu thu: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < height; i++ ) {
            for (int j = 0; j < width; j++) {
                System.out.println(arr[i][j]);
            }
        }
        int max = maxArray(arr);
        System.out.println();
        System.out.println(max);
    }
    public static int maxArray(int [][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
