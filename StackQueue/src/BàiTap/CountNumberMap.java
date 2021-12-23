package BàiTap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountNumberMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhâp vào 1 chuỗi: ");
        String word = scanner.nextLine();
        Map<String, Integer> map = countCharacter(word);
        System.out.println(map);
    }

    private static Map<String, Integer> countCharacter(String word) {
        Map<String, Integer> map = new TreeMap<>();
        char[] chars = word.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int key = 1;
            if (map.containsKey(String.valueOf(chars[i]))) {
                key = map.get(String.valueOf(chars[i])) + 1;
            }
            map.put(String.valueOf(chars[i]), key);
        }
        return map;
    }
}
