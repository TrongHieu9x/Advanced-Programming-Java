package StaticMethod;

public class main {
    public static void main(String[] args) {
        //phương thức thay đổi cuộc gọi
        Student.change();

        //tạo đối tượng
        Student s1 = new Student(123, "Hoang");
        Student s2 = new Student(456, "Huy");
        Student s3 = new Student(789, "Hieu");

        //phương pháp hiển thị cuộc gọi
        s1.display();
        s2.display();
        s3.display();
    }
}
