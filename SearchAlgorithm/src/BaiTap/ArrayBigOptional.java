package BaiTap;

import java.util.LinkedList;
import java.util.Scanner;

public class ArrayBigOptional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Nhap chuoi: ");
        String string = input.nextLine();
// Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();;
            }

            list.add(string.charAt(i));//1 câu lệnh

            if (list.size() > max.size()) { //1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }
// Hiển thị chuỗi liên tiếp dài nhất
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
