package ClassCircleCylinder;

public class ClassCircle {
    private double radius;
    private String color;

    public ClassCircle(){
    }

    public ClassCircle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "classCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
