package ThucHanh;

//Tạo lớp BubbleSort, khai báo mảng số nguyên
public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

//cài đặt phương thức BubbleSort(int[] list
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
//Mảng có thể được sắp xếp và thẻ tiếp theo không cần thiết
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i + 1]) {
//Danh sách hoán đổi[i] với danh sách[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
//Đường chuyền tiếp theo vẫn cần thiết
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}