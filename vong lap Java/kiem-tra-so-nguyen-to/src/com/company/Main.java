package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");

        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " ko phai so ngto");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " la so ngto");
            else
                System.out.println(number + " ko phai so ngto");
        }
    }
}
