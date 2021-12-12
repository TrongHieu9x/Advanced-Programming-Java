package StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor để khởi tạo biến
    Student(int r, String n){
    rollno = r;
    name = n;
    }

    //phương pháp tĩnh để thay đổi giá trị của biến tĩnh
    static void change(){
        college = "CODEGYM";
    }

    //phương pháp hiển thị giá trị
    void  display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}