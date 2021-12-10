package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 2;
        int count = 100;

        while(num < count) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    flag =false;
                    break;
                }
            }
            if (flag){
                System.out.println(num + ", ");
            }
            num++;
        }
    }
}
