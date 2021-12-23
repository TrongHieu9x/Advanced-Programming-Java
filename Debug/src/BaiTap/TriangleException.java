package BaiTap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        TriangleException triangle = new TriangleException();
        triangle.Number(a, b, c);
    }

    private void Number(int a, int b, int c) throws IllegalTriangleException {
        try {
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b) {
                System.out.println("Đây là 3 cạnh của tam giác");
            } else {
                throw new IllegalTriangleException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi    ");
        } catch (IllegalTriangleException e) {
            System.out.println("Không phải 3 cạnh của tam giác   ");
        }
    }
    private static class IllegalTriangleException extends Exception{
    }
}
