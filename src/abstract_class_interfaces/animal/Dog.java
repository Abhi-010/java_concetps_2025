package abstract_class_interfaces.animal;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("Dog is moving");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }


}
