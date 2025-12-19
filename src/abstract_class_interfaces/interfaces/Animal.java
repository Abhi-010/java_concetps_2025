package abstract_class_interfaces.interfaces;

enum FlightStages implements Trackable{
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION,
    ;

    @Override
    public void track() {

    }
}

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface FlightEnabled{
    int SOME_CONSTANT = 4;
    void takeOff() ;
    void land();
    void fly() ;
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move() ;
}
