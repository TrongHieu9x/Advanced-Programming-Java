package ThucHanh.AbstractAndInterface.Animal;

import ThucHanh.AbstractAndInterface.ediblel.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger : roarrrrrr....!";
    }

    @Override
    public String howToEat() {
        return "An ga";
    }
}
