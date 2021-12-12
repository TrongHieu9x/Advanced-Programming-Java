package AccessModifier;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
}
