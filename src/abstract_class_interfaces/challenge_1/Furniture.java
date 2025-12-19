package abstract_class_interfaces.challenge_1;

public class Furniture extends ProductForSale{


    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this " + type + " is a beautiful reproduction");
        System.out.println(description);
    }
}
