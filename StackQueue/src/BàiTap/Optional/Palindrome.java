package BàiTap.Optional;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> stringQueue = null;
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        boolean check = true;
        for (int i = 0; i < chars.length; i++) {
            if (!stack.pop().equals(chars[i])) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
