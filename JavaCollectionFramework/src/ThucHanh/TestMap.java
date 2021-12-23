package ThucHanh;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {

//Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);
        System.out.println("Hiển thị các mục trong HashMap");
        System.out.println(hashMap + "\n");

//Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị các mục theo thứ tự giảm dần của key");
        System.out.println(treeMap);

//Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> linkedHasMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHasMap.put("Smith", 30);
        linkedHasMap.put("Anderson", 31);
        linkedHasMap.put("Lewis", 29);
        linkedHasMap.put("Cook", 29);
        System.out.println("\nThe age for" + "Lewis is " + linkedHasMap.get("Lewis"));
    }
}