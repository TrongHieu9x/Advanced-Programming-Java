package Studen;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        System.out.println(student);
        student.setName("Hieu");
        student.setClasses("C1021H1");
        System.out.println(student);
        Input(student1);
        System.out.println(student1);
    }

    public static void Input(Student student){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter your class: ");
        student.setClasses(scanner.nextLine());
    }
}
