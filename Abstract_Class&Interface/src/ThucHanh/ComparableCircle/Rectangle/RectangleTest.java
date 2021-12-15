package ThucHanh.ComparableCircle.Rectangle;

import java.awt.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(rectangle);
        System.out.println(rectangle);

        rectangle = new Rectangle(rectangle);
        System.out.println(rectangle);
    }
}