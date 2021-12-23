package ThucHanh;

import java.util.Scanner;

public class NumberFormat {
    private Object Numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        NumberFormat numberFormat = new NumberFormat();
        numberFormat.Numbers(x,y);
    }

    private void Numbers(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y = " + a);
            System.out.println("Hieu x - y = " + b);
            System.out.println("Tich x * y = " + c);
            System.out.println("Thuong x / y = " + d);
        } catch (Exception e) {
            System.out.println("Loi : " + e.getMessage());
        }
    }
}
