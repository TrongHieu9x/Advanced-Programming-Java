package BaiTap;

public class TriangleClassifier {
    public static String classifierTriangle(int a, int b, int c) {
        if (a == b || b == c) {
            return "tam giac deu";
        } else if (a + b > c || a + c > b || b + c > a) {
            if (a == b || b == c || a == c){
                return "Tam giac can";
            }else {
                return "Tam giac thuong";
            }
        }else {
            return "Khong phai tam giac";
        }
    }
}
