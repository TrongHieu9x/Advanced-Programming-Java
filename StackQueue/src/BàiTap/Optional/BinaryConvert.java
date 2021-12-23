package BàiTap.Optional;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number (Binary): ");
        int number2 = scanner.nextInt();
        System.out.println("Chuyển đổi sang thập phân = " + binaryToDecimal(String.valueOf(number2)));
    }

    public static String decimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        do {
            stack.push(number % 2);
            number = number / 2;
        } while ((number / 2) != 0);
        String num = "1";
        while (stack.size() > 0) {
            num += stack.pop();
        }
        if (number == 0) {
            return num = "0";
        } else {
            return num;
        }
    }

    private static int binaryToDecimal(String number) {
        char[] chars = number.toCharArray();
        int number2 = 0;
        for (int i = 0; i < chars.length; i++) {
            int temp = Integer.parseInt(String.valueOf(chars[i]));
            double temp2 = Math.pow(2, (chars.length - i - 1));
            number2 += temp * temp2;
        }
        return number2;
    }
}
