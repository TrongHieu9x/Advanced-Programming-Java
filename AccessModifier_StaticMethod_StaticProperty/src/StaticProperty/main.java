package StaticProperty;

public class main {

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.getNumberOfCars);
        Car car2 = new Car("Mazda6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
