package ClassCircleCylinder;

public class main {
    public static void main(String[] args) {
        ClassCircle classCircle = new ClassCircle(1,"red");
        System.out.println(classCircle);

        Cylinder cylinder = new Cylinder(2,"blue",4);
        System.out.println(cylinder);
    }
}
