package AccessModifier;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1,"red");
        Circle circle2 = new Circle(5,"blue");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
