package abstract_class_interfaces.interfaces;

public class SuperMan implements FlightEnabled{

    @Override
    public void takeOff() {
        System.out.println("Work done.. ");
    }

    @Override
    public void land() {

    }

    @Override
     public void fly(){
       //int SOME_CONSTANT = 1;
        System.out.println(SOME_CONSTANT);
    }
}
