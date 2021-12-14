package ClassCircleCylinder;

public class Cylinder extends ClassCircle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolum() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", which is a subclass of " +
                super.toString() +'}';
    }
}
