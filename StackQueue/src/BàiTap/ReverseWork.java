package BàiTap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter chuoi : ");
        String mWorld = scanner.nextLine();
        String newWorld = reverString(mWorld);
        System.out.println(newWorld);
    }
    
    private static String reverString(String mWorld) {
        Stack<String> wStack = new Stack<>();
        char[] chars = mWorld.toCharArray();
        for (int i = 0; i < chars.length; i++){
            wStack.push(String.valueOf(chars[i]));
        }
        String newWorld = "";
        while (wStack.size() != 0) {
            newWorld += wStack.pop();
        }
        return newWorld;
    } 
}
