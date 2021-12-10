package Bai_tap;

import java.util.Scanner;

public class sumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number of array: ");
        int length1 = scanner.nextInt();
        System.out.print("Enter column number of array; ");
        int length2 = scanner.nextInt();
        int[][] array = new int[length1][length2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print("Enter " + length1 + "elements of array: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("the array is: ");
        display(array);
        sum(array);
    }
    public static void display(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print("array[i][j]");
            }
            System.out.println();
        }
    }
    public static void sum(int[][]array){
        System.out.print("Enter the column that you want to sum: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum = sum + array[i][x];
        }
        System.out.println("sum of column " + x + " is: " + sum);
    }
}
