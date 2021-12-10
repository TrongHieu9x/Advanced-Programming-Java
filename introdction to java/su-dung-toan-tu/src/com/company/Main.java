package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);// khai báo đối tượng Scanner

        System.out.println("Enter width");
        width = scanner.nextFloat();// Nhập chiều rộng

        System.out.println("Enter height");
        height = scanner.nextFloat();// Nhập chiều dài

        float area = width * height;// tính diện tích

        System.out.println("Area is: " + area);
    }
}
