package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("nhap so tien USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.printf("gia tri VND: " + quydoi);
    }
}
