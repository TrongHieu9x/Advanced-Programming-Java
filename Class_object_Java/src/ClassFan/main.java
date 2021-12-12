package ClassFan;

public class main {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan();
        ClassFan fan2 = new ClassFan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("red");
        fan1.setOn(true);
        System.out.println("fan1: " + fan1.toString());

        fan2.setSpeed(fan2.fast);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(true);
        System.out.println("fan2: " + fan2.toString());
    }
}
