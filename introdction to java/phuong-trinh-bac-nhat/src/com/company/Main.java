package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Linear Equation Resolver");
//        System.out.println("'a * x + b = 0' nhập vào giá trị");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b: ");
//        double b = scanner.nextDouble();
//
//        if (a != 0 && b == 0){
//            System.out.printf("phuong trinh co nghiem x = 0");
//        }
//        else if ( a == 0 && b == 0){
//            System.out.printf("phuong trinh vo so nghiem");
//        }
//        else if ( a == 0 && b != 0) {
//            System.out.printf("phuong trinh vo nghiem");
//        }
//        else {
//            System.out.printf("phuong trinh co nghiem x = -b/a");
//        }
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
