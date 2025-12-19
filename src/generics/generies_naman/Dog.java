package generics.generies_naman;

public class Dog extends Animal{
    private int height=6;

    public Dog(int height) {
        this.height = height;
    }
    public Dog(){}

    public Dog(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                "} " + super.toString();
    }
}
