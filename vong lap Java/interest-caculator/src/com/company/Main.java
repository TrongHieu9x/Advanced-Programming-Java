package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter investment amount: ");
        money = input.nextDouble();

        System.out.println("enter number of months: ");
        month = input.nextInt();

        System.out.println("enter annual interest rate in percentage");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("total oof interest: " + totalInterest);
    }
}
