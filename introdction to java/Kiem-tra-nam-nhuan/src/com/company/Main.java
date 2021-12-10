package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int year;
//
        System.out.println("Enter a year");
        year = scanner.nextInt();
//    Cach 1
//        if (year % 4 == 0){
//            if (year % 100 == 0){
//                if  ( year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is not a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        } else {
//            System.out.printf("%d is  not a leap year", year);
//        }

//      Cach 2
        boolean isleapYear = false;

        boolean isDivisibleby4 = year % 4 == 0;
        if (isDivisibleby4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isleapYear = true;
                }
            }else{
                isleapYear = true;
            }
        }
        if (isleapYear){
            System.out.printf("%d is  leap year", year);
        } else {
            System.out.printf("%d ia not a leap year", year);
        }
    }
}
