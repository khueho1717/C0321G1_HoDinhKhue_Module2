package bai7_abstraction_interface.thuc_hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: chit chit";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
