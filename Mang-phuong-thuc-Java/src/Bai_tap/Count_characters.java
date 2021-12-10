package Bai_tap;

import java.util.Scanner;

public class Count_characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("nhap vao chuoi");

        String str = scanner.nextLine();
        System.out.println("nhap vao phan tu");
        String character = scanner.nextLine();

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character.charAt(0)){
                count++;
            }
        }

        System.out.println(count);
    }
}