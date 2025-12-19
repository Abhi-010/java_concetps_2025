package abstract_class_interfaces.interfaces;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " tracked. ");
    }
}
